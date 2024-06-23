<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Admin Dashboard</title>
</head>

<body>
    <!DOCTYPE html>
    <!-- Created by CodingLab |www.youtube.com/CodingLabYT-->
    <html lang="en" dir="ltr">

    <head>
        <meta charset="UTF-8">
        <!--<title> Drop Down Sidebar Menu | CodingLab </title>-->
        <link rel="stylesheet" href="style.css">
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/fontawesome.min.css">
        <script src="https://kit.fontawesome.com/82ad4ee6e7.js" crossorigin="anonymous"></script>


        <!-- Bootstrap CSS -->
        <script src="https://kit.fontawesome.com/82ad4ee6e7.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/fontawesome/4/.7.0/css/font-awesome.min.css">
    </head>

    <body>


        <form action="AdmindashboardController">
            <div class="sidebar close" style="background-color: #40652F;">
                <div class="logo-details">
                    <a class="navbar-brand" href="#">
                        <img src="image/WhatsApp Image 2022-05-20 at 3.59.59 PM.jpeg" alt=""
                            class="d-inline-block align-text-top">
                    </a>
                   <span class="logo_name">AGRI MEDS</span>
                </div>
                <ul class="nav-links">

                    <li>
                        <a href="#">
                            <i class='bx bx-grid-alt'></i>
                            <span class="link_name">HOME PAGE</span>
                        </a>
                        <ul class="sub-menu blank">
                            <li><a class="link_name" href="#">HOME PAGE</a></li>
                        </ul>
                    </li>
                    <li>
                        <div class="iocn-link">
                            <a href="#">
                                <i class='bx bx-collection'></i>
                                <span class="link_name">LIBRARY</span>
                            </a>
                            <i class='bx bxs-chevron-down arrow'></i>
                        </div>
                        <ul class="sub-menu">
                            <li><a class="link_name" href="#">LIBRARY</a></li>
                            <li><a href="#">VIEW</a></li>
                            <li><a href="addLib.jsp">ADD</a></li>
                            <li><a href="removeLib.jsp">REMOVE</a></li>
                        </ul>
                    </li>
                    <li>
                        <div class="iocn-link">
                            <a href="#">
                                <i class='bx bx-book-alt'></i>
                                <span class="link_name">COMMUNITY</span>
                            </a>
                            <i class='bx bxs-chevron-down arrow'></i>
                        </div>
                        <ul class="sub-menu">
                            <li><a class="link_name" href="#">COMMUNITY</a></li>
                            <li><a href="#">VIEW</a></li>
                            <li><a href="AddComm.jsp">ADD</a></li>
                            <li><a href="removeComm.jsp">REMOVE</a></li>
                        </ul>
                    </li>
                    <li>
                        <div class="iocn-link">
                            <a href="#">
                                <i class='bx bx-plug'></i>
                                <span class="link_name">BLOG</span>
                            </a>
                            <i class='bx bxs-chevron-down arrow'></i>
                        </div>
                        <ul class="sub-menu">
                            <li><a class="link_name" href="#">BLOG</a></li>
                            <li><a href="#">VIEW</a></li>
                            <li><a href="addBlog.jsp">ADD</a></li>
                            <li><a href="removeBlog.jsp">REMOVE</a></li>
                        </ul>
                    </li>
                    <li>
                        <div class="iocn-link">
                            <a href="#">
                                <i class="fa fa-gear"></i>
                                <span class="link_name">SETTINGS</span>
                            </a>
                            <i class='bx bxs-chevron-down arrow'></i>
                        </div>
                        <ul class="sub-menu">
                            <li><a class="link_name" href="#">SETTINGS</a></li>
                            <li><a href="AdminReg.jsp">REGISTER NEW ADMIN</a></li>
                        </ul>
                    </li>

                    <li>
                        <div class="profile-details">
                            <div class="profile-content">
                                <!--<img src="image/profile.jpg" alt="profileImg">-->
                            </div>
                            <div class="name-job">
                                <div class="profile_name">ADMIN</div>
                                <div class="job">Web Desginer</div>
                            </div>
                            <i class='bx bx-log-out'></i>
                        </div>
                    </li>
                </ul>
            </div>
            <section class="home-section" style="height: 100%; width:auto">
                <div class="home-content">
                    <i class='bx bx-menu'></i>
                    <span class="text">Explore</span>

                </div>


               <!-- <div class="container">
                    <h1><b>AGRI MEDS</b></h1>
                    <div class="d1"> --> 


                    <div class="row">
                        <div class="col-md-3 profile text-center" style="margin-left: 10%;">
                            <div class="img-box">
                                <img src="data:image/jpeg;base64,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"
                                    class="rounded-circle" width="200" height="200">


                            </div>
                            <h2>LIBRARY</h2>

                            <p>more than 100+ solutions over different diseases..</p>
                            <h3>100+</h3>
                            <h4>solutions</h4>
                        </div>
                        <div class="col-lg-3 profile text-center">
                            <div class="img-box">
                                <img src="data:image/png;base64,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
                              0OmeJT66QpN1+yH1xwDBR0Xhjr5HT/rKDWTGLXpaokdNLqofVgsT+voF8YHnbr+4HrbohN+fBYtdJiFh1a8FmpI7RLUBxP3q1WwbTKuttl3JtKED0oanjB+dPpwvcCbcbLivtKegzbnhw0NYIfpndQbwUUc0S/Q3Omwe2v7Cmvn9KOQ6XYzRJ8zmDP9JRLGQuEi3vYUX29VV1866XLMy+Ys7taSwBZadn40GaaBKzus0FBFXI8dNlNZOGJ7tQcK+wW3x3asXnwubd7Yz4C1RtI9H99U27bPkTN902mQ8znuJxW3Y+9xe+4mweVkFQS6WrLbZWIR5uEP9vK/2TtIhnBm3EJ3AhlBxv3yr3xj0S9Kt0rn5RrXrsPLN2FBo+muysA87ILgeY4iG97+6buSe/I6ogf67WEv1GHeI+/VE/E9C1dPLsBVhaH/sQX2HeKo3Jrx/RWblKHd9ivN7NawI/+Q+i7+QYqUsDJWc4Lr+j+6z+P/CQYhYg7EoGPaeCNJjj43vltjvKxyEzEkLqkAJjACyFPfYIJffutLtkcCeiyePNyAMABQqDZROKaK68A9H/YrAYKMIa1YAImD2sGSMF48QESHplwVWigqGBAcLFRRbUj7FHqfGTP7+PfW+IqCnNBFlkAHgcAIMoLmH7CD2yQU6/1GA3yZKrmEGE3JCQNZPtrrbp6nHt6WQcYw+5Q77P4BuCBTEOyREo3r47N8QwNwgPc0d1jNqoDEgILaAnoztl/qV7SiwSee5jzjBFhcg4Q1umIEQreUQzi8JqK4ciCwUTJcxxTRgc2TUH3X3brN7iwnoLwOh2gT8MGnbUX0rhGj/+jSCKhJr0ByQvHQag6WonwBu5Ps0TPW3Ihv0yTMFPBlbo0LF9A4E0f5KI8/dBDBx3ZFsDPxVEg4KVSncRxDJXtdafEW4TCROZ18TzNdULMVwlhT3Dd/nFp3vCOh4dDyNsURIqtIXbgeYQyThVjL4/xfQ8UjS/KBeGRhzoFRnCeL2Iqn/L4CUoi+WXA9XAM1uDVOvKQg3tnn/7wLcGDKxJWHPE3K9T2KhTOLssgnyMKP9lyI58VP5OLpzYSiW4jNi4ew+Df9HDQeomZpiaQyGGocrFuapnPmtKBu79f9vAYem66gvUDPePk5Ki2wGaA5RL39yGqUbM7UsQFdb3BvmmgtkwIXre87f6Dj/sUiI/qD1TcRJ74mPajecNYik/UGNA9I0YxMA3LCuHzRfujB86RKmXS8M2kkAxFMt7vZiDaJq3E9Ji91GFq/Suny1we57Ao4Udtk0lYfbgPVVTPliW8BFiLKdye8IqjmxFDZztxOpqCNfTOYsX4jmfuEajw/FrBdHOsyJGO8auXXtzrefi//TapWBLHgasz42TyEq7Zp+QKhK8QcIRfui9a6YaxDJrJPwX4vS1QaIuP8LNSjfBvFo1D+Wx6FKx3aJMOrmMFi86fUxxOPC7W9/KzTIFuZRv4m2znzRIj6D2L+dn5JuHkPFBdUvtdhQ5mLHuecQt18y8d/EzLOLNXIqiWHZWT9E9rCN8sMbbcPfw8iCpr72xRR+mEVBX+5k5ou9HzdBxPWWPyKM86AXPtLI1WK2lyBqv3k+Rl3+O3PxuJ/zk6uX9d/ECKRD+KQk7unt0ltvXvwjocVCV8TXIP44xg0IN1yDbvxy9vjZPtwGscP4qMTnTyXYgHDTZfa6E//a0aoXs1BvY3kb4lH7PR/g0Fv8DXO4EaK41Pzn5pElGzvHb4PY+avR39bVqEJZ9NBrewPi8VL+0vmRBuXDSzjegnh06y9e0PaqxPPWEztAPGq3X1GsLH50ZcgHEI/Ebn4iEMCbeSXRThBFP5O/35A08F7rafEaxKN7++uiFVEU/tqYX4TYWY/FS5H+l9CifH4V1KcQj1b7Z6WnlCXt641XXofYTWRV/EX9MD0U1ctT+CbEzi9P/kC18mST170PxCOxvP9tI1nsLXRn+R5EccVi+ayPwq4AeXnedKzYEWJnP8Lyf6kdyqq1S4O+CrHTrc7ChXNfAMgj590GLp9CPB7tNppdZbczPhpE7ZMrA78KUfRCqOLnl5a+DdCMo+yTGdwDoiDzRjH/hp0U3Uwi9TLgP4EoQjtpvr96ZTwuwzfaC81kD4hHonWap3hy/+xr+FjRtJaxA8CdIB7F7X2XtaZ4L4tp8qa+POxC84rsBfEo7p8N6+jj7imUFlEd+quZ+9dlR4id6LbogcNfaECE0VGeV9nVfssVXZV9IQpxwyyN8oJtv+j7njBkRR6l2fVTEzGX/SEKsa5Z2iSxaIH1BGjf4pEXcd6kG5tdvSzfgSiE+OKi2zyOiyAQt6ar4MRF6kFQxLGYPOeyl3KZy/cgHoUx0Qzr6ngd0lzto2YWeYfNc66WoWnL7Vx3kn9pTrY8hx6l6wAAAABJRU5ErkJggg=="
                                    class="rounded-circle" width="200" height="200">

                            </div>
                            <h2>BLOGS</h2>

                            <p>we have resembling and trustworthy blogs on this site..</p>
                            <h3>15+</h3>
                            <h4>Blogs</h4>
                        </div>
                        <div class="col-lg-3 profile text-center">
                            <div class="img-box">
                                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSc7ZIHfPTIXGBgil22j80qHIFyMFleSO1tOw&usqp=CAU"
                                    class="rounded-circle" width="200" height="200">
                                <div class="carousel-caption">

                                </div>
                            </div>
                            <h2>SATISFIED USERS</h2>
                            <p>we have some incredible satisfied users having amazing experience.. </p>
                            <h3>1000+</h3>
                            <h4>satisfied users</h4>
                        </div>

                        <br><br>
                        <br>
                        <br>
                        <div class="col-md-3 profile text-center" style="margin-left: 25%; margin-top: 30px;">
                            <div class="img-box">
                                <img src="data:image/jpeg;base64,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"
                                    class="rounded-circle" width="200" height="200">
                            </div>
                            <h2>SEARCHES</h2>
                            <p> Lot of people serached agri meds over the globe..</p>
                            <h3>500+</h3>
                            <h4>Searches</h4>
                        </div>
                        <div class="col-md-3 profile text-center" style="margin-top: 30px;">
                            <div class="img-box">
                                <img src="data:image/jpeg;base64,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"
                                    class="rounded-circle" width="200" height="200">

                            </div>
                            <h2>ADMINS</h2>
                            <p> trusting admins with all knowledge about agricultural studies..</p>
                            <h3>2+</h3>
                            <h4>admins</h4>
                        </div>
                    </div>
                </div>
            </div>

                <!-- Optional JavaScript; choose one of the two! -->

                <!-- Option 1: Bootstrap Bundle with Popper -->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
                    crossorigin="anonymous"></script>

                <!-- Option 2: Separate Popper and Bootstrap JS -->
                <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
            </section>

            <script>
                let arrow = document.querySelectorAll(".arrow");
                for (var i = 0; i < arrow.length; i++) {
                    arrow[i].addEventListener("click", (e) => {
                        let arrowParent = e.target.parentElement.parentElement;//selecting main parent of arrow
                        arrowParent.classList.toggle("showMenu");
                    });
                }
                let sidebar = document.querySelector(".sidebar");
                let sidebarBtn = document.querySelector(".bx-menu");
                console.log(sidebarBtn);
                sidebarBtn.addEventListener("click", () => {
                    sidebar.classList.toggle("close");
                });
            </script>
    </body>

    </html>
    </form>
</body>

</html> 
</body>
</html>