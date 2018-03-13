package lda;

public class Lda {

    int nTopics;
    int nIter = 2000;
    double alpha = 0.1;
    double eta = 0.01;
    Integer randomState = null;
    int refresh = 10;

    Lda(int nTopics, int nIter, int alpha, int eta, Integer randomState, int refresh){
        this.nTopics = nTopics;
        this.nIter = nIter;
        this.alpha = alpha;
        this.eta = eta;
        this.randomState = randomState;
        this.refresh = refresh;

        if (alpha <= 0 || eta <=0){
            System.out.println("alpha and eta must be greater than zero");
        }
    }




}
