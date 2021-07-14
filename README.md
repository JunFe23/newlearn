# NewLearn.README

# 프로젝트 설명


- 프로젝트 명 : 인터넷 강의 플렛폼 제작
- 개발 인원 : 5명
- 사용환경 : Apache Tomcat 8.0
- IDE : Intellij
- 사용 프레임워크 : JAVA11, Springboot(2.4x), Spring Security, Thymeleaf, Mybatis
- 사용 기술 : MVC, jQuery, Ajax, Mail API, 결제API
- Database : MySQL
- 개발기간 : 2021.05.01  ~ 2021.06.08

# 프로젝트 선정 배경

쌍용교육센터에서 개발자 과정 수업을 듣고 수료하기까지 수업이 비대면으로 진행되었습니다. 코로나 19로 인해 현재 많은 수업들이 비대면으로 진행되고 있고, 온라인 교육의 수요가 계속해서 증가하고 있는 추세입니다. 저희는 이런 점에서 "비대면 수업과 관련한 서비스를 제작해보면 어떨까?"라는 아이디어에 착안하였고 이를 프로젝트의 주제로 선정하였습니다.

# 1. 요구사항 분석
![image](https://user-images.githubusercontent.com/75111342/122737278-d9386080-d2bb-11eb-87d5-b93bded7e5bf.png)

# 2. 테이블 설계

- ERD 설계


![image](https://user-images.githubusercontent.com/75111342/122737426-fbca7980-d2bb-11eb-86c8-cc12f127e0d2.png)

- 테이블 구성


![image](https://user-images.githubusercontent.com/75111342/122737475-08e76880-d2bc-11eb-9461-507ba477b8e4.png)

# 3. 페이지 구현
- 메인 페이지


![image](https://user-images.githubusercontent.com/75111342/122745122-a2664880-d2c3-11eb-976d-27d10f01733e.png)

- 로그인 페이지


![image](https://user-images.githubusercontent.com/75111342/122746493-063d4100-d2c5-11eb-9cd3-0d1dde6439fc.png)

- 회원가입 페이지


![image](https://user-images.githubusercontent.com/75111342/122746609-22d97900-d2c5-11eb-846f-62f3390c8ba2.png)

- 비밀번호 찾기 페이지


![image](https://user-images.githubusercontent.com/75111342/122747142-aabf8300-d2c5-11eb-97ac-edf2ab0fa28c.png)

- 강의 리스트 페이지


![image](https://user-images.githubusercontent.com/75111342/122747822-77312880-d2c6-11eb-8692-66298b7647b4.png)

- 강의 상세 페이지


![image](https://user-images.githubusercontent.com/75111342/122747937-9a5bd800-d2c6-11eb-84ee-ec5dbee578cb.png)

- 강의 커리큘럼 및 후기 페이지


![image](https://user-images.githubusercontent.com/75111342/122748027-b5c6e300-d2c6-11eb-8bcd-5073318b97de.png)

- 강의 재생 페이지


![image](https://user-images.githubusercontent.com/75111342/122748107-ca0ae000-d2c6-11eb-87f8-e9d58e68f790.png)

- 장바구니 페이지


![image](https://user-images.githubusercontent.com/75111342/122748188-e018a080-d2c6-11eb-86f6-9b5317b9a22a.png)

- 결제 페이지


![image](https://user-images.githubusercontent.com/75111342/122748298-ffafc900-d2c6-11eb-89d2-78a853e4d79a.png)


# 개발일지

Back End

1. 역할

- ERD 작성
- AWS S3에 동영상 업로드 시 동영상 재생시간 계산
- 강의페이지의 커리큘럼 구현
- 장바구니 여부 확인 구현

2. 개발 일지


## 2021.05.10
- Git 공부

## 2021.05.15

- DB 테이블 설계 및 생성.

## 2021.05.20

1. 강의 페이지

- 강의 이미지, 내용 DB연동 및 렌더링
- 커리큘럼 페이지 구현.
- 커리큘럼에서 강의 클릭시 해당 강의로 Id값 가지고 재생 페이지로 이동.

## 2021.05.23

- ffmpeg을 이용한 동영상 재생 길이 구하는 클래스 작성.

## 2021.05.25

- 프로젝트 배포를 위한 AWS EC2 공부.

## 2021.05.28

- ffmpeg을 이용한 동영상 재생 길이 구해서 DB에 정보 저장.

## 2021.06.01

1. 장바구니 담은 여부에 따른 강의 페이지 렌더링 구현

1) 강의가 담겨 있을 경우

- 결제하기 버튼 감추기

2) 강의가 담겨 있지 않을 경우

- 결제하기 버튼 보이기


# 느낀점

- 약 한 달이라는 기간동안 팀프로젝트를 진행하였다. 진행 전부터 첫 프로젝트여서 팀에 민폐가 되지 않을까 하는 걱정도 많이 하였다. 하지만 한성준 조장님이 리더십 있게 잘 팀을 끌어주었고, 능력 있는 팀원들이 부족한 부분은 서로 공유해가며 다같이 발전해 나가는 모습을 보였다. 이 과정에서 협업의 중요성을 느낄 수 있었다. 또, 부족점도 많이 보완할 수 있었다. 학원에서 배운 5.5개월의 기간으로 우리의 프로젝트를 완성하기엔 턱없이 부족했고, 새로운 강의를 구매해서 듣고, 책을 구매해서 공부하는 등 여러가지 노력을 추가로 하였다. 앞으로 업무 시에도 부족점을 발견하면 어떤 식으로 헤쳐나갈지 생각해볼 수 있는 시간이었다. 

# 보완할 점

- 협업에서 사용하는 Git 툴의 사용이 미숙했다. commit을 하다가 기존파일이 날아가는 일도 생겼고, 서로의 작업을 합치는데도 어려움을 겪었다. Git에 대해 추가적으로 심화 공부를 해야겠다. 또, Spring Security 부분은 다른 팀원이 구현하였어서 그 부분을 내가 직접 구현할 수 있도록 공부해야겠다. 정체되지 않도록 노력하자.
