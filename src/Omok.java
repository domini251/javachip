public class Omok {
    static int check(int[][] plate) {
        int temp=-1;
        int num=0;
        int ans;
        //가로
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (plate[i][j]!=0) {
                    if (temp!=0) {
                        if (temp == plate[i][j]) num++;
                        else num = 1;
                    }
                    else num++;
                    temp = plate[i][j];
                }
                else {
                    num = 0; temp = 0;
                }
                if (num == 5 && ((j == 18) || (j < 18 && plate[i][j + 1]!=temp))) return plate[i][j];
            }
            num = 0; temp = 0;
        }
        //세로
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (plate[j][i]!=0) {
                    if (temp!=0) {
                        if (temp == plate[j][i]) num++;
                        else num = 1;
                    }
                    else num++;
                    temp = plate[j][i];
                }
                else {
                    num = 0; temp = 0;
                }
                if (num == 5 && ((j == 18) || (j < 18 && plate[j + 1][i]!=temp))) return plate[j][i];
            }
            num = 0; temp = 0;
        }
        //우상향
        int x,y;
        for (int z = 0; z < 2; z++) {
            for (int i = 0; i < 19; i++) {
                if (z!=0) {
                    x = i;
                    y = 0;
                }
                else {
                    x = 18;
                    y = i;
                }
                while (x < 19 && x >= 0 && y < 19 && y >= 0) {
                    if (plate[x][y]!=0) {
                        if (temp!=0) {
                            if (temp == plate[x][y]) num++;
                            else num = 1;
                        }
                        else num++;
                        temp = plate[x][y];
                    }
                    else {
                        num = 0; temp = 0;
                    }
                    if (num == 5) {
                        if (x == 0 || y == 18) return plate[x][y];
                        if (plate[x - 1][y + 1] != temp) return plate[x][y];
                    }
                    x--; y++;
                }
                num = 0; temp = 0;
            }
        }
        //우하향
        for (int z = 0; z < 2; z++) {
            for (int i = 0; i < 19; i++) {
                if (z!=0) {
                    x = i;
                    y = 0;
                }
                else {
                    x = 0;
                    y = i;
                }
                while (x < 19 && x >= 0 && y < 19 && y >= 0) {
                    if (plate[x][y]!=0) {
                        if (temp!=0){
                            if (temp == plate[x][y]) num++;
                            else num = 1;
                        }
                        else num++;
                        temp = plate[x][y];
                    }
                    else {
                        num = 0; temp = 0;
                    }
                    if (num == 5) {
                        if (x == 18 || y == 18) return plate[x][y];
                        if (plate[x + 1][y + 1] != temp) return plate[x][y];
                    }
                    x++; y++;
                }
                num = 0; temp = 0;
            }
        }
        return 0;
    }
}
