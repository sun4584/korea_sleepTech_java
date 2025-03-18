package todo_app;

import java.util.Scanner;

import todo_app.controller.TaskController;
import todo_app.controller.UserController;

		public class App {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        UserController userController = new UserController();
		        TaskController taskController = new TaskController();
		        boolean isLoggedIn = false;
		        
		        while (true) {
		            System.out.println("\n[메뉴 선택]");
		            System.out.println("1. 회원가입\n2. 로그인\n3. 할 일 추가\n4. 종료");
		            System.out.print("선택: ");
		            int choice = scanner.nextInt();
		            scanner.nextLine();
		            
		            if (choice == 1) {
		                System.out.print("이름: ");
		                String name = scanner.nextLine();
		                System.out.print("아이디: ");
		                String username = scanner.nextLine();
		                System.out.print("비밀번호: ");
		                String password = scanner.nextLine();
		                userController.signUp(name, username, password, "", "", 0);
		            } else if (choice == 2) {
		                System.out.print("아이디: ");
		                String id = scanner.nextLine();
		                System.out.print("비밀번호: ");
		                String password = scanner.nextLine();
		                isLoggedIn = userController.signIn(id, password) != null;
		            } else if (choice == 3 && isLoggedIn) {
		                System.out.print("할 일 제목: ");
		                String title = scanner.nextLine();
		                taskController.addTask("1", title);
		            } else if (choice == 4) {
		                System.out.println("프로그램을 종료합니다.");
		                break;
		            }
		        }
		        scanner.close();
		    }
		
	
	}

