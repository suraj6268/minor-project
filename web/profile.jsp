<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ALUMNUS-PROFILE</title>

    <!-- Bootstrap 5 CSS file -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
        integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />

    <!--Swippers CSS-->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.css" />



    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet" />
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet" />
    <!-- MDB -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/5.0.0/mdb.min.css" rel="stylesheet" />

    <!-- CUSTOM CSS -->
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="profile.css">
    <!-- CUSTOM CSS END -->



</head>


<body class="main">

    <!-- nav section start -->


    <header class="top ">

        <div class="container ">
            <div class="row">
                <div class="col-md-2 logo">
                    <h1 id="logo">ALUMNUS</h1>
                </div>
                <div class="col-md-8 ">

                </div>

                <div class="col-md-2 sign">
                    YOUR PROFILE
                </div>
              


            </div>
        </div>


    </header>


    <div class="header-wrapper">

        <div class="container header-container">



            <div class="row">


                <div class="col-md-2"></div>



                <div class="col-md-8 nav-item">
                    <li><a href="index.jsp" class="active">Home</a></li>
                    <li><a href="#">Students</a></li>
                    <li><a href="home.jsp">Alumni</a></li>
                    <li><a href="#">Careers</a></li>
                    <li><a href="#">Events & Notice</a></li>
                    <li><a href="contact.html">Contact us</a></li>
                    <li><a href="#about-us">About us</a></li>

                </div>



                <div class="col-md-2 nav-search">
                    <input type="text" name="search" id="search" placeholder="search">
                </div>





            </div>
        </div>

    </div>
    <!-- navbar end -->

    <!-- alumni profile section start -->

    <section class="profile-section">
<%
            String username = (String)session.getAttribute("username");
            String email = (String)session.getAttribute("email");
            String branch = (String)session.getAttribute("branch");
            String p_year = (String)session.getAttribute("p_year");
            String city = (String)session.getAttribute("city");
            
            System.out.println(username);
            if(username==null)
            {
                response.sendRedirect("login.html");
            }
%>
        <div class="member-profile">
            <h1>My Profile</h1>
            <img src="shail_group.png" alt="">
            <p class="member-name"><h3><%=username%></h3></p>
            <p class="member-email"><%=email%></p>
            <p class="about-member"></p>
        </div>

        <hr width="75%" size="5">

        <div class="other-information-section">

            <div  class="about-section">
                 <p>Branch</p>
                <p><%=branch%></p>
            </div>
                <hr class="h-row"  size="5">
            
            <div class="about-section">
                <p>Graduation year</p>
                <p><%=p_year%></p>
            </div>
                <hr class="h-row" size="5">

            <div class="about-section">
                
                <p>Location</p>
                <p><%=city%></p>
            
            </div>
                <hr class="h-row" size="5">

            <div class="about-section">
                <p>Skills</p>
                <p>c,c++,java</p>
            </div>
                <hr class="h-row" size="5">
            
            <div class="about-section">
                <p>Language</p>
                <p>English</p>

            </div>


        </div>

     


    </section>






    <!-- alumni profile section end -->


    <!-- footer section  -->
       <footer>
   
        <div class="footer-section">
            <div class="about-institute-section">
                <img src="image/iist logo.jpg" alt="">
                <p class="about">Indore Institute of Science and Technology, Indore was established 2003. IIST is recognized as a leading institute in the state of Madhya Pradesh.</p>
            </div>
    
            <div class="useful-links">
                <h2>UseFul links</h2>
                <div class="nav-links">
                    <li class="nav-items"><a href="">HOME</a></li>
                    <li class="nav-items"><a href="">ALUMNI</a></li>
                    <li class="nav-items"><a href="">NEWS&EVENT</a></li>
                    <li class="nav-items"><a href="">COMITEE</a></li>
                </div>
            </div>
    
            <div class="about useful-links">
                <h2>about</h2>
                <div class="nav-links">
                    <li class="nav-items"><a href="">SEARCH</a></li>
                    <li class="nav-items"><a href="">SEARCH</a></li>
                    <li class="nav-items"><a href="">JOb-POST</a></li>
                    <li class="nav-items"><a href="">Contact</a></li>
                </div>
            </div>
    
            <div class="social-media">
                <div class="Login-dashboard">
                    login Dashboard
                </div>

                    <div class="social-handels">
                        <i class="fa-brands fa-facebook" class="icons"></i>
                        <i class="fa-brands fa-instagram" class="icons"></i>
                        <i class="fa-brands fa-twitter" class="icons"></i>
                        <i class="fa-brands fa-linkedin" class="icons"></i>

                    </div>
            </div>
        </div>
    </footer>
     

    
    <hr class="footer-row"/>

    <p class="copyright">� 2022 IIST Alumni / All rights reserved</p>

    <div class="end">

    </div>

    <!-- footer section end  -->






    <!--Bootstrap JS CND-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</body>