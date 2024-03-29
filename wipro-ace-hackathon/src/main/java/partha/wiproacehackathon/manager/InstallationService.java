
package partha.wiproacehackathon.manager;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import partha.wiproacehackathon.dto.Installation;

/**
 *
 * @author user1
 */
public class InstallationService extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String loginid = request.getParameter("loginid");
            String code = request.getParameter("code");
            boolean securityFlag = new Common().checkUserSecret(loginid, code);
            if (securityFlag) {
            //get the data from UI
            Map<String, String[]> arMap = request.getParameterMap();
            Map<String, String> inputMap = Common.getSingleMapValue(arMap);
            
            //convert it into DTO
            Installation i = (Installation) new Common().mapToDto(inputMap, Installation.class);
            //check the login id existance
            boolean status = new InstallationManager().checkUserAvailability(i.getLoginid());
            if (status) {
                out.write(new Gson().toJson(Constants.HTTP_USER_EXIST));
            } else {
                i.setCreatedate(System.currentTimeMillis() + "");
                String id = new InstallationManager().add(i);
                if (id == null || id.isEmpty()) {
                    out.write(new Gson().toJson(Constants.HTTP_STATUS_FAIL));
                } else {
                    out.write(new Gson().toJson(Constants.HTTP_STATUS_SUCCESS));
                }
            }
        }
        } catch (Exception ex) {
            out.write(new Gson().toJson(Constants.ERROR));
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
