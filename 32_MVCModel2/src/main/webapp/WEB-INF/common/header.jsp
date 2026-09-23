<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<header>

    <nav class="navbar navbar-expand-lg bg-white border-bottom px-4">

        <div class="container-fluid">

            <!-- 메뉴 -->
            <ul class="navbar-nav flex-grow-1 mb-2 mb-lg-0">

                <!-- 폐기량 동향 -->
                <li class="nav-item dropdown flex-fill text-center">

                    <a class="nav-link dropdown-toggle"
                       href="#"
                       role="button"
                       data-bs-toggle="dropdown">
                        폐기량 동향
                    </a>

                    <ul class="dropdown-menu">

                        <li>
                            <a class="dropdown-item" href="#">
                                특정 양력 월 비교
                            </a>
                        </li>

                        <li>
                            <a class="dropdown-item" href="#">
                                특정 음력 월 비교
                            </a>
                        </li>

                        <li>
                            <a class="dropdown-item" href="#">
                                연중 폐기량 조회
                            </a>
                        </li>

                        <li>
                            <a class="dropdown-item" href="#">
                                연도별 총량 비교
                            </a>
                        </li>

                    </ul>

                </li>


                <!-- 재고 목록 조회 -->
                <li class="nav-item dropdown flex-fill text-center">

                    <a class="nav-link dropdown-toggle"
                       href="#"
                       role="button"
                       data-bs-toggle="dropdown">
                        재고 목록 조회
                    </a>

                    <ul class="dropdown-menu">

                        <li>
                            <a class="dropdown-item" href="#">
                                재고 조회
                            </a>
                        </li>

                        <li>
                            <a class="dropdown-item" href="#">
                                재고 변동 내역
                            </a>
                        </li>

                    </ul>

                </li>


                <!-- 회원 가입 요청 조회 -->
                <li class="nav-item dropdown flex-fill text-center">

                    <a class="nav-link dropdown-toggle"
                       href="#"
                       role="button"
                       data-bs-toggle="dropdown">
                        회원 가입 요청 조회
                    </a>

                    <ul class="dropdown-menu">

                        <li>
                            <a class="dropdown-item" href="#">
                                가입 요청 목록
                            </a>
                        </li>

                    </ul>

                </li>

            </ul>


            <!-- 사용자 -->
            <div class="dropdown">

                <button class="btn dropdown-toggle"
                        data-bs-toggle="dropdown">

                    <i class="bi bi-person-circle me-1"></i>
                    폐기량 동향 조회 권한을 가진 박관리자

                </button>


                <ul class="dropdown-menu dropdown-menu-end">

                    <li>
                        <a class="dropdown-item" href="#">
                            프로필
                        </a>
                    </li>

                    <li>
                        <a class="dropdown-item" href="#">
                            설정
                        </a>
                    </li>

                    <li>
                        <hr class="dropdown-divider">
                    </li>

                    <li>
                        <a class="dropdown-item" href="#">
                            로그아웃
                        </a>
                    </li>

                </ul>

            </div>

        </div>

    </nav>

</header>