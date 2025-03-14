# **kiosk**

***

## 1️⃣ 프로젝트 개요

이 프로젝트는 햄버거 가게의 주문 시스템을 자바 콘솔 프로그램으로 구현한 것이다.
사용자는 다음과 같은 플로우를 따라 주문을 진행할 수 있다:

카테고리 선택 → 메뉴 선택 및 장바구니 담기(반복 가능) → 주문 메뉴 선택 → 할인 적용 → 최종 결제

•	먼저 사용자는 버거, 음료, 사이드 중 원하는 카테고리를 선택하고,
•	해당 카테고리에 포함된 메뉴 중 원하는 메뉴를 골라 장바구니에 담는다. (원하는 만큼 반복 가능)
•	이후 국가유공자, 군인, 일반 등 할인 대상을 선택하여 할인율을 적용받는다.
•	마지막으로 총 금액을 확인하고 주문을 확정한다.

***

## 2️⃣ 실행 방법

1. 필요한 환경 구성하기

- Java Jdk: 17버전
- IDE: IntelliJ IDEA

2. 프로젝트 클론하기

https://github.com/hosung77/kioskk

3. Main에서 실행

***
## 3️⃣ Git 전략

- gitflow 방식 적용

브랜치는 main, dev, **feature/***로 나누어 관리하였으며, 기능 개발은 feature 브랜치에서 진행한 후,
기능 단위로 dev 브랜치에 Pull Request를 통해 병합하였다. 전체 기능 개발이 완료되면, dev 브랜치를 main에 병합하여 최종 코드를 반영하였다.

## 4️⃣ 브랜치 개발 순서

feature/nec_lv1 ~ lv 5 -> feature/chall_lv1 -> feature/fix_category ~ 2 -> feature/fix_menuList -> feature/chall_lv2

## 5️⃣ 주요 기능

### ✅ **카테고리 선택**

키오스크 실행 시 버거, 음료, 사이드 중 하나를 선택할 수 있으며, 선택한 카테고리에 포함된 메뉴 리스트가 출력된다.

### ✅ **장바구니 담기**

메인 메뉴(카테고리) 선택 시 나오는 리스트를 선택하면 선택한 메뉴 명을 확인시켜주고 장바구니에 추가할 지 안할지 정할 수 있다.

### ✅ **조건을 통한 ORDER MENU 표시**

장바구니에 하나라도 메뉴가 담겨 있다면, 기존의 카테고리 선택(1~3번) 외에 4. 최종 주문 / 5. 주문 취소 메뉴가 추가로 표시된다.

### ✅ **주문 기능**

**최종 주문(4번)**을 선택하면, 현재 장바구니에 담긴 메뉴와 총 금액이 출력되며 1. 주문 확정 / 2. 메뉴판으로 돌아가기 중 선택할 수 있다.

### ✅ **유형별 할인 적용**

최종 결제 시, 국가유공자 / 군인 / 일반인 등의 할인 유형을 선택할 수 있으며 선택한 할인 유형에 따라 할인율이 적용된다. 이 할인 정보는 enum으로 관리된다.
