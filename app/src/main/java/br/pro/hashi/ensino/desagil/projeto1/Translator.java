package br.pro.hashi.ensino.desagil.projeto1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// Não é permitido mudar nada nessa classe
// exceto o recheio dos três métodos.

@SuppressWarnings("SuspiciousNameCombination")
public class Translator {
    private final Node root;
    private final HashMap<Character, Node> map;

    // Você deve mudar o recheio deste construtor,
    // de acordo com os requisitos não-funcionais.
    public Translator() {
        root = new Node(' ');
        map = new HashMap<>();

        Node E = new Node('E');
        root.setLeft(E);
        E.setParent(root);
        map.put('E', E);

        Node T = new Node('T');
        root.setRight(T);
        T.setParent(root);
        map.put('T', T);

        Node I = new Node('I');
        E.setLeft(I);
        I.setParent(E);
        map.put('I', I);

        Node A = new Node('A');
        E.setRight(A);
        A.setParent(E);
        map.put('A', A);

        Node N = new Node('N');
        T.setLeft(N);
        N.setParent(T);
        map.put('N', N);

        Node M = new Node('M');
        T.setRight(M);
        M.setParent(T);
        map.put('M', M);

        Node S = new Node('S');
        I.setLeft(S);
        S.setParent(I);
        map.put('S', S);

        Node U = new Node('U');
        I.setRight(U);
        U.setParent(I);
        map.put('U', U);

        Node R = new Node('R');
        A.setLeft(R);
        R.setParent(A);
        map.put('R', R);

        Node W = new Node('W');
        A.setRight(W);
        W.setParent(A);
        map.put('W', W);

        Node D = new Node('D');
        N.setLeft(D);
        D.setParent(N);
        map.put('D', D);

        Node K = new Node('K');
        N.setRight(K);
        K.setParent(N);
        map.put('K', K);

        Node G = new Node('G');
        M.setLeft(G);
        G.setParent(M);
        map.put('G', G);

        Node O = new Node('O');
        M.setRight(O);
        O.setParent(M);
        map.put('O', O);

        Node H = new Node('H');
        S.setLeft(H);
        H.setParent(S);
        map.put('H', H);

        Node V = new Node('V');
        S.setRight(V);
        V.setParent(S);
        map.put('V', V);

        Node F = new Node('F');
        U.setLeft(F);
        F.setParent(U);
        map.put('F', F);

        Node UR = new Node(' ');
        U.setRight(UR);
        UR.setParent(U);

        Node L = new Node('L');
        R.setLeft(L);
        L.setParent(R);
        map.put('L', L);

        Node RR = new Node(' ');
        R.setRight(RR);
        RR.setParent(R);

        Node P = new Node('P');
        W.setLeft(P);
        P.setParent(W);
        map.put('P', P);

        Node J = new Node('J');
        W.setRight(J);
        J.setParent(W);
        map.put('J', J);

        Node B = new Node('B');
        D.setLeft(B);
        B.setParent(D);
        map.put('B', B);

        Node X = new Node('X');
        D.setRight(X);
        X.setParent(D);
        map.put('X', X);

        Node C = new Node('C');
        K.setLeft(C);
        C.setParent(K);
        map.put('C', C);

        Node Y = new Node('Y');
        K.setRight(Y);
        Y.setParent(K);
        map.put('Y', Y);

        Node Z = new Node('Z');
        G.setLeft(Z);
        Z.setParent(G);
        map.put('Z', Z);

        Node Q = new Node('Q');
        G.setRight(Q);
        Q.setParent(G);
        map.put('Q', Q);

        Node OE = new Node(' ');
        O.setLeft(OE);
        OE.setParent(O);

        Node OR = new Node(' ');
        O.setRight(OR);
        OR.setParent(O);

        Node FIVE = new Node('5');
        H.setLeft(FIVE);
        FIVE.setParent(H);
        map.put('5', FIVE);

        Node FOUR = new Node('4');
        H.setRight(FOUR);
        FOUR.setParent(H);
        map.put('4', FOUR);

        Node TREE = new Node('3');
        V.setRight(TREE);
        TREE.setParent(V);
        map.put('3', TREE);

        Node TWO = new Node('2');
        UR.setRight(TWO);
        TWO.setParent(UR);
        map.put('2', TWO);

        Node ADD = new Node('+');
        RR.setLeft(ADD);
        ADD.setParent(RR);
        map.put('+', ADD);

        Node ONE = new Node('1');
        J.setRight(ONE);
        ONE.setParent(J);
        map.put('1', ONE);

        Node SIX = new Node('6');
        B.setLeft(SIX);
        SIX.setParent(B);
        map.put('6', SIX);

        Node EQUAL = new Node('=');
        B.setRight(EQUAL);
        EQUAL.setParent(B);
        map.put('=', EQUAL);

        Node BARRA = new Node('/');
        X.setLeft(BARRA);
        BARRA.setParent(X);
        map.put('/', BARRA);

        Node SEVEN = new Node('7');
        Z.setLeft(SEVEN);
        SEVEN.setParent(Z);
        map.put('7', SEVEN);

        Node EIGHT = new Node('8');
        OE.setLeft(EIGHT);
        EIGHT.setParent(OE);
        map.put('8', EIGHT);

        Node NINE = new Node('9');
        OR.setLeft(NINE);
        NINE.setParent(OR);
        map.put('9', NINE);

        Node ZERO = new Node('0');
        OR.setRight(ZERO);
        ZERO.setParent(OR);
        map.put('0', ZERO);
    }


    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public char morseToChar(String code) {
        Node current = root;

        for (int i = 0; i < code.length(); i++) {
            char dot_dash = code.charAt(i);

            if (dot_dash == '.') {
                current = current.getLeft();
            } else if (dot_dash == '-') {
                current = current.getRight();
            }
        }
        if (current != null) {
            return current.getValue();
        } else {
            return ' ';
        }
    }


    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public String charToMorse(char c) {
        //Construção de strings recomendado ao invés de concatenação. Exemplo: '.' + morse
        StringBuilder morse = new StringBuilder();
        Node current = map.get(c);

        while (current != root) {
            assert current != null;
            if (current.getParent().getLeft() == current) {
                morse.insert(0, '.');
            } else if (current.getParent().getRight() == current) {
                morse.insert(0, '-');
            }
            current = current.getParent();
        }

        return morse.toString();
    }


    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public LinkedList<String> getCodes() {
        Queue<Node> queue = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.element();
            Node left = node.getLeft();
            Node right = node.getRight();
            if (left != null) {
                queue.add(left);
            }
            if (right != null) {
                queue.add(right);
            }
            if (node.getValue() != ' ' && node.getValue() != '/' && node.getValue() != '+' && node.getValue() != '=') {
                list.add(charToMorse(node.getValue()));
            }
            queue.remove();
        }
        return list;
    }
}
