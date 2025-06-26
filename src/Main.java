import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sssssss = new Scanner(System.in);
        ArrayList<String> todos2 = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("================================");
        System.out.println("📝 할일 관리 프로그램에 오신 것을 환영합니다!");
        System.out.println("================================");
        boolean a = true;
        while (a) {
            System.out.println("\n🚗🚗 멋진 메뉴를 선택하세요:🚗🚗");
            System.out.println("1. 🚕할일 추가🚕");
            System.out.println("2. 🚙 할일 목록 보기🚙");
            System.out.println("3. 🚌 할일 상태 변경🚌");
            System.out.println("4. 🚎프로그램 종료🚎");
            System.out.print("선택: ");

            String choice = sssssss.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("📝 새로운 할일을 입력하세요: ");
                    String todo = sssssss.nextLine();
                    todos2.add(todo);
                    break;
                case "2":
                    for (String aaa : todos2) {
                        if (aaa == null) {
                            break;
                        } else {
                            System.out.println(aaa);
                        }
                    }
                    break;
                default:
                    System.out.println("❌ 잘못된 선택입니다. 1-4 사이의 숫자를 입력해주세요.\n");
                //투두스에서 선택된거 하나 삭제하기  (삭제할 번호를 받는다)
                case "3":
                    System.out.println("몇번의 할일을 완료했어?");
                    int fixnumber = Integer.parseInt(br.readLine())-1;
                    if ( fixnumber >= todos2.size() || fixnumber < 0){
                        todos2.remove(fixnumber);
                        System.out.println("한 일을 삭제했습니다");
                    }else{
                        System.out.println("올바른 값을 입력하세요.");
                    }



                    //삭제할 번호를 받는다

                    break;

                case "4":
                    a =false;
                    break;
            }
        }

//        System.out.println("================================");
//        System.out.println("안녕히가세요.");
//        System.out.println("================================");
    }
}
