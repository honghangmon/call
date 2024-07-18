import java.util.Scanner;

public class nail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 테스트 케이스의 개수
        int T = scan.nextInt();

        for (int t = 1; t <= T; t++) {
            // N 입력 받기
            int N = scan.nextInt();

            // 달팽이 배열 생성
            int[][] snail = new int[N][N];

            // 방향 설정 (오른쪽, 아래, 왼쪽, 위)
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};
            int dir = 0; // 처음에는 오른쪽으로 이동

            int x = 0, y = 0; // 시작 위치
            for (int i = 1; i <= N * N; i++) {
                snail[x][y] = i; // 숫자 채우기

                // 다음 위치 계산
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                // 다음 위치가 배열 범위를 벗어나거나 이미 채워져 있으면 방향 전환
                if (nx < 0 || nx >= N || ny < 0 || ny >= N || snail[nx][ny] != 0) {
                    dir = (dir + 1) % 4; // 방향 전환
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }

                // 위치 업데이트
                x = nx;
                y = ny;
            }

            // 결과 출력
            System.out.println("#" + t);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(snail[i][j] + " ");
                }
                System.out.println();
            }
        }

        scan.close();
    }
}