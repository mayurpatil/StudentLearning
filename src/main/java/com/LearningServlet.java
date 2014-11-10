package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LearningServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/html");

        URL urlFinal;

        String string = ((req.getParameter("query").toString()).trim());
        string = string.replaceAll("\\s", "");

        resp.getWriter()
                .print("<html><body bgcolor=pink><form method=get action=/learning><center><div bgcolor=pink><font color=blue size=6>I want to learn about:</font><input type=text name=query><input type=submit name=converter value=Learn!></div></center></form>");

        resp.getWriter()
                .print("<center><table border=1> <tr><th>Inventor</th><th>Patents</th><th>Meaning</th> <th>Examples </th> <th>Formula </th></tr>");

        urlFinal = getURL("inventor%20of%20" + string);

        URL urlFinalWEB = getURLWeb("inventor%20of%20" + string);

        URL urlFinalM = getURL("meaning%20of%20" + string);

        URL urlFinalMWEB = getURLWeb("meaning%20of%20" + string);

        URL urlFinalE = getURL("examples%20of%20" + string);

        URL urlFinalEWEB = getURLWeb("examples%20of%20" + string);

        URL urlFinalA = getURL("applications%20of%20" + string);

        URL urlFinalAWEB = getURLWeb("applications%20of%20" + string);

        URL urlFinalF = getURL("formula%20of%20" + string);

        URL urlFinalFWEB = getURLWeb("formula%20of%20" + string);

        URL urlFinalP = getURL("patents%20of%20" + string);

        URL urlFinalPWEB = getURLWeb("patents%20of%20" + string);

        URL urlFinalT = getURL("types%20of%20" + string);

        URL urlFinalTWEB = getURLWeb("types%20of%20" + string);

        URL urlFinalFUN = getURL("functions%20of%20" + string);

        URL urlFinalFUNWEB = getURLWeb("functions%20of%20" + string);

        URL urlFinalINV = getURL("investment%20of%20" + string);
        URL urlFinalINVWEB = getURLWeb("investment%20of%20" + string);

        URL urlFinalREF = getURL("analogy%20of%20" + string);

        URL urlFinalREFWEB = getURLWeb("analogy%20of%20" + string);

        URL urlFinalLimitations = getURL("limitations%20of%20" + string);
        URL urlFinalLimitationsWEB = getURLWeb("limitations%20of%20" + string);

        URL urlFinalAdvantages = getURL("advantages%20of%20" + string);

        URL urlFinalAdvantagesWEB = getURLWeb("advantages%20of%20" + string);

        URL urlFinalCompany = getURL("company%20of%20" + string);

        URL urlFinalCompanyWEB = getURLWeb("company%20of%20" + string);

        URL urlFinalCompetitor = getURL("competitor%20of%20" + string);
        URL urlFinalCompetitorWEB = getURLWeb("competitor%20of%20" + string);

        URL urlFinalEvolution = getURL("evolution%20of%20" + string);
        URL urlFinalEvolutionWEB = getURLWeb("evolution%20of%20" + string);
        resp.getWriter()
                .print("&nbsp;&nbsp; <tr>"

                + "<td><a href= "
                        + urlFinal

                        + "><img src="
                        + urlFinal
                        + " height=250 width=250 ></a>&nbsp;<br><a href="
                        + urlFinalWEB
                        + " target=_blank><font color=blue>know more</font></a></td>"

                        + "<td><a href= " + urlFinalP

                        + "><img src=" + urlFinalP
                        + " height=250 width=250 ></a>&nbsp;<br><a href="
                        + urlFinalPWEB
                        + "><font color=blue>know more</font></a></td>"

                        + "<td><a href= " + urlFinalM

                        + "><img src= " + urlFinalM
                        + " height=250 width=250></a>&nbsp;<br><a href="
                        + urlFinalMWEB
                        + "><font color=blue>know more</font></a></td>"

                        + "<td><a href= " + urlFinalE

                        + "><img src=" + urlFinalE
                        + " height=250 width=250></a>&nbsp;<br><a href="
                        + urlFinalEWEB
                        + "><font color=blue>know more</font></a></td>"

                        + "<td><a href=" + urlFinalF

                        + "><img src=" + urlFinalF
                        + " height=250 width=250></a>&nbsp;<br><a href="
                        + urlFinalFWEB
                        + "><font color=blue>know more</font></a></td></tr>");

        resp.getWriter()
                .print("<tr><th>Limitations</th><th>Advantages</th><th>Company</th><th>Competitor</th><th>Evolution</th></tr>");

        resp.getWriter().print(
                "&nbsp;&nbsp; <tr>"

                + "<td><a href= " + urlFinalLimitations

                + "><img src=" + urlFinalLimitations
                        + " height=250 width=250 ></a>&nbsp;<br><a href="
                        + urlFinalLimitationsWEB
                        + "><font color=blue>know more</font></a></td>"

                        + "<td><a href= " + urlFinalAdvantages

                        + "><img src=" + urlFinalAdvantages
                        + " height=250 width=250 ></a>&nbsp;<br><a href="
                        + urlFinalAdvantagesWEB
                        + "><font color=blue>know more</font></a></td>"

                        + "<td><a href= " + urlFinalCompany

                        + "><img src= " + urlFinalCompany
                        + " height=250 width=250></a>&nbsp;<br><a href="
                        + urlFinalCompanyWEB
                        + "><font color=blue>know more</font></a></td>"

                        + "<td><a href= " + urlFinalCompetitor

                        + "><img src=" + urlFinalCompetitor
                        + " height=250 width=250></a>&nbsp;<br><a href="
                        + urlFinalCompetitorWEB
                        + "><font color=blue>know more</font></a></td>"

                        + "<td><a href=" + urlFinalEvolution

                        + "><img src=" + urlFinalEvolution
                        + " height=250 width=250></a>&nbsp;<br><a href="
                        + urlFinalEvolutionWEB
                        + "><font color=blue>know more</font></a></td></tr>");

        resp.getWriter()
                .print("<tr><th>Types</th><th>Functions</th><th>Investment</th><th>Analogy</th><th>Applications</th></tr>");

        resp.getWriter()
                .print("&nbsp;&nbsp; <tr>"

                + "<td><a href= "
                        + urlFinalT

                        + "><img src="
                        + urlFinalT
                        + " height=250 width=250 ></a>&nbsp;<br><a href="
                        + urlFinalTWEB
                        + "><font color=blue>know more</font></a></td>"

                        + "<td><a href= "
                        + urlFinalFUN

                        + "><img src="
                        + urlFinalFUN
                        + " height=250 width=250 ></a>&nbsp;<br><a href="
                        + urlFinalFUNWEB
                        + "><font color=blue>know more</font></a></td>"

                        + "<td><a href= "
                        + urlFinalINV

                        + "><img src="
                        + urlFinalINV
                        + " height=250 width=250 ></a>&nbsp;<br><a href="
                        + urlFinalINVWEB
                        + "><font color=blue>know more</font></a></td>"

                        + "<td><a href= "
                        + urlFinalREF

                        + "><img src="
                        + urlFinalREF
                        + " height=250 width=250 ></a>&nbsp;<br><a href="
                        + urlFinalREFWEB
                        + "><font color=blue>know more</font></a></td>"

                        + "<td><a href="
                        + urlFinalA

                        + "><img src="
                        + urlFinalA

                        + " height=250 width=250></a>&nbsp;<br><a href="
                        + urlFinalAWEB
                        + "><font color=blue>know more</font></a></td></tr></table></center></body></html>");

    }

    public URL getURL(String queryImage) {
        URL url = null;
        try {

            {
                url = new URL(
                        "https://ajax.googleapis.com/ajax/services/search/images?v=1.0&q="
                                + queryImage.toLowerCase(Locale.ENGLISH));

                BufferedReader in = new BufferedReader(new InputStreamReader(
                        url.openStream()));

                String s;
                String urlStr = null;
                while ((s = in.readLine()) != null) {

                    String[] st = s.split(",");

                    for (int i = 0; i < st.length; i++) {

                        {
                            String result = st[i];

                            if (result.contains("unescapedUrl")) {
                                String[] str = result.split(":");
                                StringBuilder strB = new StringBuilder();
                                strB.append(str[1]);
                                strB.append(":");
                                strB.append(str[2]);

                                strB.delete(0, 1);
                                strB.delete(strB.length() - 1, strB.length());

                                urlStr = strB.toString();
                                // urlList.add(urlStr);

                                if (urlStr.contains(queryImage)
                                        || urlStr.endsWith(queryImage)

                                        || urlStr.matches(queryImage)
                                        || urlStr.equalsIgnoreCase(queryImage)

                                        || urlStr.startsWith(queryImage)) {
                                    url = new URL(urlStr);
                                    break;
                                }

                                // Special treatment for applications/examples
                                else if (queryImage.contains("%20")) {
                                    String[] queryImg = queryImage.split("%20");

                                    if (urlStr.endsWith(queryImg[2])
                                            || urlStr.startsWith(queryImg[2])
                                            || urlStr.matches(queryImage)
                                            || urlStr
                                                    .equalsIgnoreCase(queryImage)
                                            || urlStr.contains(queryImg[2])) {
                                        url = new URL(urlStr);
                                        break;
                                    }
                                }
                            }
                        }
                    }

                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return url;

    }

    public URL getURLWeb(String queryImage) {
        URL url = null;
        try {

            {
                url = new URL(
                        "https://ajax.googleapis.com/ajax/services/search/web?v=1.0&q="
                                + queryImage.toLowerCase(Locale.ENGLISH));

                BufferedReader in = new BufferedReader(new InputStreamReader(
                        url.openStream()));

                String s;
                String urlStr = null;
                while ((s = in.readLine()) != null) {

                    String[] st = s.split(",");

                    for (int i = 0; i < st.length; i++) {

                        {
                            String result = st[i];

                            if (result.contains("unescapedUrl")) {
                                String[] str = result.split(":");
                                StringBuilder strB = new StringBuilder();
                                strB.append(str[1]);
                                strB.append(":");
                                strB.append(str[2]);

                                strB.delete(0, 1);
                                strB.delete(strB.length() - 1, strB.length());

                                urlStr = strB.toString();
                                // urlList.add(urlStr);

                                if (urlStr.contains(queryImage)
                                        || urlStr.endsWith(queryImage)

                                        || urlStr.matches(queryImage)
                                        || urlStr.equalsIgnoreCase(queryImage)

                                        || urlStr.startsWith(queryImage)) {
                                    url = new URL(urlStr);
                                    break;
                                }

                                // Special treatment for applications/examples
                                else if (queryImage.contains("%20")) {
                                    String[] queryImg = queryImage.split("%20");

                                    if (urlStr.endsWith(queryImg[2])
                                            || urlStr.startsWith(queryImg[2])
                                            || urlStr.matches(queryImage)
                                            || urlStr
                                                    .equalsIgnoreCase(queryImage)
                                            || urlStr.contains(queryImg[2])) {
                                        url = new URL(urlStr);
                                        break;
                                    }
                                }
                            }
                        }
                    }

                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return url;

    }
 }
