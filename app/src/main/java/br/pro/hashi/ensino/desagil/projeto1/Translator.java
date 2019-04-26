package br.pro.hashi.ensino.desagil.projeto1;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// Não é permitido mudar nada nessa classe
// exceto o recheio dos três métodos.

public class Translator {
    private final Node root;
    private final HashMap<Character, Node> map;

    // Você deve mudar o recheio deste construtor,
    // de acordo com os requisitos não-funcionais.
    public Translator() {
        root = new Node(' ');
        map = new HashMap<>();

        Node E = new Node('e');
        root.setLeft(E);
        E.setParent(root);
        map.put('e', E);

        Node T = new Node('t');
        root.setRight(T);
        T.setParent(root);
        map.put('t', T);

        Node I = new Node('i');
        E.setLeft(I);
        I.setParent(E);
        map.put('i', I);

        Node A = new Node('a');
        E.setRight(A);
        A.setParent(E);
        map.put('a', A);

        Node N = new Node('n');
        T.setLeft(N);
        N.setParent(T);
        map.put('n', N);

        Node M = new Node('m');
        T.setRight(M);
        M.setParent(T);
        map.put('m', M);

        Node S = new Node('s');
        I.setLeft(S);
        S.setParent(I);
        map.put('s', S);

        Node U = new Node('u');
        I.setRight(U);
        U.setParent(I);
        map.put('u', U);

        Node R = new Node('r');
        A.setLeft(R);
        R.setParent(A);
        map.put('r', R);

        Node W = new Node('w');
        A.setRight(W);
        W.setParent(A);
        map.put('w', W);

        Node D = new Node('d');
        N.setLeft(D);
        D.setParent(N);
        map.put('d', D);

        Node K = new Node('k');
        N.setRight(K);
        K.setParent(N);
        map.put('k', K);

        Node G = new Node('g');
        M.setLeft(G);
        G.setParent(M);
        map.put('g', G);

        Node O = new Node('o');
        M.setRight(O);
        O.setParent(M);
        map.put('o', O);

        Node H = new Node('h');
        S.setLeft(H);
        H.setParent(S);
        map.put('h', H);

        Node V = new Node('v');
        S.setRight(V);
        V.setParent(S);
        map.put('v', V);

        Node F = new Node('f');
        U.setLeft(F);
        F.setParent(U);
        map.put('f', F);

        Node UR = new Node(' ');
        U.setRight(UR);
        UR.setParent(U);

        Node L = new Node('l');
        R.setLeft(L);
        L.setParent(R);
        map.put('l', L);

        Node RR = new Node(' ');
        R.setRight(RR);
        RR.setParent(R);

        Node P = new Node('p');
        W.setLeft(P);
        P.setParent(W);
        map.put('p', P);

        Node J = new Node('j');
        W.setRight(J);
        J.setParent(W);
        map.put('j', J);

        Node B = new Node('b');
        D.setLeft(B);
        B.setParent(D);
        map.put('b', B);

        Node X = new Node('x');
        D.setRight(X);
        X.setParent(D);
        map.put('x', X);

        Node C = new Node('c');
        K.setLeft(C);
        C.setParent(K);
        map.put('c', C);

        Node Y = new Node('y');
        K.setRight(Y);
        Y.setParent(K);
        map.put('y', Y);

        Node Z = new Node('z');
        G.setLeft(Z);
        Z.setParent(G);
        map.put('z', Z);

        Node Q = new Node('q');
        G.setRight(Q);
        Q.setParent(G);
        map.put('q', Q);

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
            if (current != null) {
                char dot_dash = code.charAt(i);

                if (dot_dash == '.') {
                    current = current.getLeft();
                } else if (dot_dash == '-') {
                    current = current.getRight();
                } else {
                    return ' ';
                }
            } else {
                return ' ';
            }
        }
        return current.getValue();
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
