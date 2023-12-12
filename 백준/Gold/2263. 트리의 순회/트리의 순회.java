import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] inorder;
	static int[] postorder;
	static void preorder(int ins, int posts, int length) throws IOException {
		if(length == 0) return;
		int n = postorder[posts + length - 1]; //후위순회의 마지막 요소는 트리의 루트에 해당하므로 전위순회의 첫번째 요소가 된다.
		int idx = 0;
		bw.write(n + " ");
		if(length == 1) {
			return;
		}
		// 루트에 해당하는 요소를 중위순회 배열에서 찾는다.
		for(int i = 0 ; i < length; i++) {
			if(inorder[ins + i] == n) {
				idx = i;
				break;
			}
		}
		// 중위순회 배열을 루트를 분할점으로 분할하고 후위순회배열도 해당 길이만큼 같이 분할하여 탐색한다.
		preorder(ins, posts , idx);
		preorder(ins + idx + 1, posts + idx , length - idx - 1);
	}
	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		inorder = new int[N];
		postorder = new int[N];
		StringTokenizer ist = new StringTokenizer(br.readLine());
		StringTokenizer pst = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			inorder[i] = Integer.parseInt(ist.nextToken());
			postorder[i] = Integer.parseInt(pst.nextToken());	
		}
		preorder(0, 0, N);
		br.close();
		bw.close();
	}
}