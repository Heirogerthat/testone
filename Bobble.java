//Download by http://www.codefans.net

public final class Bobble
{

    public static int aX;
    public static int aY;
    public static int aM;
    public static int aN;
    public static int nA;
    public static int mD;
    public static int aA[];
    private static int cX;
    private static int cY;
    private static int bX;
    private static int bY;
    private static int cL;
    private static int aG;
    private static Random rA;
    public static final int CO[] = {
        -994, -984, -970, -951, -927, -898, -866, -829, -788, -743,
        -694, -642, -587, -529, -469, -406, -342, -275, -207, -139,
        -69, 0, 69, 139, 207, 275, 342, 406, 469, 529,
        587, 642, 694, 743, 788, 829, 866, 898, 927, 951,
        970, 984, 994
    };
    public static final int SI[] = {
        -104, -173, -241, -309, -374, -438, -499, -559, -615, -669,
        -719, -766, -809, -848, -882, -913, -939, -961, -978, -990,
        -997, -1000, -997, -990, -978, -961, -939, -913, -882, -848,
        -809, -766, -719, -669, -615, -559, -499, -438, -374, -309,
        -241, -173, -104
    };

    public Bobble()
    {
    }

    private static int gA()
    {
        sCk();
        if(cL == 32)
            cL = 1;
        int i;
        do
            i = (rA.nextInt() >>> 1) % 6 + 1;
        while((cL & 1 << i - 1) == 0);
        return i;
    }

    private static void sbA()
    {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        for(int i4 = 0; i4 < 10; i4++)
        {
            int l3 = 0;
            if(aA[5 + 6 * i4] == -1)
                l3 = 1;
            for(int j4 = 0; j4 < 6; j4++)
            {
                int j = j4 + 6 * i4;
                int i = aA[j] & 0xf;
                if(aA[j] > 0 && i > 0)
                    if(j4 == 0)
                    {
                        int k = aA[j + 1] & 0xf;
                        if(k > 0)
                            aA[j] = aA[j] | 0x40000;
                        if(k == i)
                            aA[j] = aA[j] | 0x400;
                        if(i4 != 9)
                        {
                            int l = aA[j + 6 + l3] & 0xf;
                            if(l > 0)
                                aA[j] = aA[j] | 0x80000;
                            if(l == i)
                                aA[j] = aA[j] | 0x800;
                            if(l3 > 0)
                            {
                                int i1 = aA[j + 6] & 0xf;
                                if(i1 > 0)
                                    aA[j] = aA[j] | 0x100000;
                                if(i1 == i)
                                    aA[j] = aA[j] | 0x1000;
                            }
                        }
                        if(i4 > 0)
                        {
                            int j1 = aA[(j - 6) + l3] & 0xf;
                            if(j1 > 0)
                                aA[j] = aA[j] | 0x20000;
                            if(j1 == i)
                                aA[j] = aA[j] | 0x200;
                            if(l3 > 0)
                            {
                                int k1 = aA[j - 6] & 0xf;
                                if(k1 > 0)
                                    aA[j] = aA[j] | 0x10000;
                                if(k1 == i)
                                    aA[j] = aA[j] | 0x100;
                            }
                        }
                    } else
                    if(l3 > 0 && j4 == 4 || l3 == 0 && j4 == 5)
                    {
                        int l1 = aA[j - 1] & 0xf;
                        if(l1 > 0)
                            aA[j] = aA[j] | 0x200000;
                        if(l1 == i)
                            aA[j] = aA[j] | 0x2000;
                        if(i4 != 9)
                        {
                            int i2 = aA[j + 5 + l3] & 0xf;
                            if(i2 > 0)
                                aA[j] = aA[j] | 0x100000;
                            if(i2 == i)
                                aA[j] = aA[j] | 0x1000;
                            if(l3 > 0)
                            {
                                int j2 = aA[j + 6 + l3] & 0xf;
                                if(j2 > 0)
                                    aA[j] = aA[j] | 0x80000;
                                if(j2 == i)
                                    aA[j] = aA[j] | 0x800;
                            }
                        }
                        if(i4 > 0)
                        {
                            int k2 = aA[(j - 7) + l3] & 0xf;
                            if(k2 > 0)
                                aA[j] = aA[j] | 0x10000;
                            if(k2 == i)
                                aA[j] = aA[j] | 0x100;
                            if(l3 > 0)
                            {
                                int l2 = aA[(j - 6) + l3] & 0xf;
                                if(l2 > 0)
                                    aA[j] = aA[j] | 0x20000;
                                if(l2 == i)
                                    aA[j] = aA[j] | 0x200;
                            }
                        }
                    } else
                    {
                        int i3 = aA[j + 1] & 0xf;
                        if(i3 > 0)
                            aA[j] = aA[j] | 0x40000;
                        if(i3 == i)
                            aA[j] = aA[j] | 0x400;
                        i3 = aA[j - 1] & 0xf;
                        if(i3 > 0)
                            aA[j] = aA[j] | 0x200000;
                        if(i3 == i)
                            aA[j] = aA[j] | 0x2000;
                        if(i4 != 9)
                        {
                            int j3 = aA[j + 6 + l3] & 0xf;
                            if(j3 > 0)
                                aA[j] = aA[j] | 0x80000;
                            if(j3 == i)
                                aA[j] = aA[j] | 0x800;
                            j3 = aA[j + 5 + l3] & 0xf;
                            if(j3 > 0)
                                aA[j] = aA[j] | 0x100000;
                            if(j3 == i)
                                aA[j] = aA[j] | 0x1000;
                        }
                        if(i4 > 0)
                        {
                            int k3 = aA[(j - 6) + l3] & 0xf;
                            if(k3 > 0)
                                aA[j] = aA[j] | 0x20000;
                            if(k3 == i)
                                aA[j] = aA[j] | 0x200;
                            k3 = aA[(j - 7) + l3] & 0xf;
                            if(k3 > 0)
                                aA[j] = aA[j] | 0x10000;
                            if(k3 == i)
                                aA[j] = aA[j] | 0x100;
                        }
                    }
            }

        }

    }

    public static void init()
    {
        cL = 0;
        aG = 0;
        rA = new Random();
        aA = new int[60];
        nA = 0;
        int j = 11;
        for(int i = 0; i < 60; i++)
        {
            if(i < 18)
            {
                aA[i] = (rA.nextInt() >>> 1) % 3 + 1;
                nA++;
            } else
            {
                aA[i] = 0;
            }
            if(i == j)
            {
                if(aA[i] != 0)
                    nA--;
                aA[i] = -1;
                j += 12;
            }
        }

        sbA();
        aN = gA();
    }

    public static void sAID()
    {
        aX = 48;
        aY = 152;
        cX = aX * 1000;
        cY = aY * 1000;
        aM = aN;
        aN = gA();
    }

    public static int move()
    {
        byte byte0 = 2;
        int k = CO[mD];
        int l = SI[mD];
        cX += 1 * k;
        cY += 1 * l;
        aX = cX / 1000;
        aY = cY / 1000;
        bY = aY / 16;
        int i;
        if(aA[5 + 6 * bY] == -1)
        {
            i = 1;
            bX = (aX - 8) / 16;
        } else
        {
            i = 0;
            bX = aX / 16;
        }
        int j = bX + 6 * bY;
        if(mD != 21 && (bX > 0 && bX < 5 - i && aA[j - 1] > 0 && aA[j + 1] > 0 || i == 0 && bX == 0 && aA[j + 1] > 0 || i == 0 && bX == 5 && aA[j - 1] > 0))
        {
            aA[j] = aM;
            sbA();
            nA++;
            return 0;
        }
        int i1 = aX + 1;
        int j1 = aX - 1;
        int k1 = 89;
        byte byte1 = 7;
        if(i1 > k1 || j1 < byte1)
        {
            if(i1 > k1)
                aX = k1;
            if(j1 < byte1)
                aX = byte1 + 1;
            mD = 42 - mD;
            k = CO[mD];
            l = SI[mD];
            byte0 = 1;
        }
        if(aY - 1 < 15)
        {
            aY = 8;
            bY = aY / 16;
            if(aA[5 + 6 * bY] == -1)
                bX = (aX - 8) / 16;
            else
                bX = aX / 16;
            j = bX + 6 * bY;
            aA[j] = aM;
            sbA();
            nA++;
            return 0;
        }
        j = bX + 6 * bY;
        int l1 = (cY + 1 * l) / 1000 / 16;
        int i2;
        if(aA[5 + 6 * l1] == -1)
            i2 = ((cX + 1 * k) / 1000 - 8) / 16;
        else
            i2 = ((cX + 1 * k) / 1000 - 0) / 16;
        int j2 = i2 + 6 * l1;
        if(aA[j2] > 0)
        {
            if(aA[j] == -1)
            {
                if(aA[j - 1] > 0)
                {
                    bY++;
                    aA[j + 6] = aM;
                } else
                {
                    bX--;
                    aA[j - 1] = aM;
                }
            } else
            {
                aA[j] = aM;
            }
            sbA();
            nA++;
            return 0;
        }
        if(j2 > 0 && j2 < 59)
        {
            if((j + 1) % 6 == 0 || j % 6 == 0)
                return byte0;
            if(mD == 21 && (aA[j2 - 1] > 0 || aA[j2] > 0))
            {
                if(aA[5 + 6 * bY] == -1 && j2 == (j - 6) + 1 || aA[5 + 6 * bY] != -1 && j2 == j - 6)
                {
                    aA[j] = aM;
                    sbA();
                    nA++;
                    return 0;
                }
            } else
            if(mD > 21 && aA[j2] > 0)
            {
                if(aA[5 + 6 * bY] == -1 && j2 == (j - 6) + 1 || aA[5 + 6 * bY] != -1 && j2 == j - 6)
                {
                    aA[j] = aM;
                    sbA();
                    nA++;
                    return 0;
                }
            } else
            if(mD > 21 && aA[j2 - 1] > 0 && aA[j + 1] > 0)
            {
                if(aA[5 + 6 * bY] == -1 && j2 == (j - 6) + 1 || aA[5 + 6 * bY] != -1 && j2 == j - 6)
                {
                    aA[j] = aM;
                    sbA();
                    nA++;
                    return 0;
                }
            } else
            if(mD > 21 && aA[j2 - 1] > 0 && aA[j2 + 1] > 0)
            {
                if(aA[5 + 6 * bY] == -1 && j2 == (j - 6) + 1 || aA[5 + 6 * bY] != -1 && j2 == j - 6)
                {
                    aA[j2] = aM;
                    bY = l1;
                    bX = i2;
                    sbA();
                    nA++;
                    return 0;
                }
            } else
            if(mD < 21 && aA[j2] > 0)
            {
                if(aA[5 + 6 * bY] == -1 && j2 == j - 6 || aA[5 + 6 * bY] != -1 && j2 == j - 6 - 1)
                {
                    aA[j] = aM;
                    sbA();
                    nA++;
                    return 0;
                }
            } else
            if(mD < 21 && aA[j2 + 1] > 0 && aA[j - 1] > 0)
            {
                if(aA[5 + 6 * bY] == -1 && j2 == j - 6 || aA[5 + 6 * bY] != -1 && j2 == j - 6 - 1)
                {
                    aA[j] = aM;
                    sbA();
                    nA++;
                    return 0;
                }
            } else
            if(mD < 21 && aA[j2 + 1] > 0 && aA[j2 - 1] > 0 && (aA[5 + 6 * bY] == -1 && j2 == j - 6 || aA[5 + 6 * bY] != -1 && j2 == j - 6 - 1))
            {
                aA[j2] = aM;
                bY = l1;
                bX = i2;
                sbA();
                nA++;
                return 0;
            }
        }
        if(bX > 0 && bX < 5 - i && mD > 21)
        {
            int k2;
            if(aA[5 + 6 * bY] == -1)
                k2 = aX - 8;
            else
                k2 = aX - 0;
            if(k2 % 16 >= 13 && k2 % 16 <= 15 && aA[j + 1] > 0)
            {
                aA[j] = aM;
                sbA();
                nA++;
                return 0;
            }
        } else
        if(bX > 0 && bX < 5 - i && mD < 21)
        {
            int l2;
            if(aA[5 + 6 * bY] == -1)
                l2 = aX - 8;
            else
                l2 = aX - 0;
            if(l2 % 16 >= 0 && l2 % 16 <= 2 && aA[j - 1] > 0)
            {
                aA[j] = aM;
                sbA();
                nA++;
                return 0;
            }
        }
        return byte0;
    }

    public static final void dtR(int i)
    {
        int ai[] = new int[60];
        for(int j = 0; j < 60; j++)
            ai[j] = aA[j];

        i = i / 2 + 3;
        if(i > 7)
            i = 7;
        int i1 = 0;
        for(int k = 0; k < 6; k++)
        {
            int j1;
            while((j1 = (rA.nextInt() >>> 1) % i + 1) == i1) ;
            if(j1 == 7 && (ai[k] & 0xf) == j1)
                j1 = (rA.nextInt() >>> 1) % 6 + 1;
            if(j1 == 7 && ai[5] == -1 && k > 0 && (ai[k - 1] & 0xf) == j1)
                j1 = (rA.nextInt() >>> 1) % 6 + 1;
            if(j1 == 7 && ai[5] != -1 && (ai[k + 1] & 0xf) == j1)
                j1 = (rA.nextInt() >>> 1) % 6 + 1;
            i1 = j1;
            aA[k] = j1;
            nA++;
        }

        i1 = 1;
        for(int k1 = 0; i1 < 10; k1++)
        {
            for(int l = 0; l < 6; l++)
                aA[l + 6 * i1] = ai[l + 6 * k1];

            i1++;
        }

        if(aA[11] != -1)
        {
            nA--;
            aA[5] = -1;
        }
        sbA();
    }

    public static int bom()
    {
        int ai[] = new int[60];
        for(int i = 0; i < 60; i++)
            ai[i] = aA[i];

        int k = sNB(bX + 6 * bY);
        if(k >= 3)
        {
            nA -= k;
        } else
        {
            for(int j = 0; j < 60; j++)
                aA[j] = ai[j];

            k = 0;
        }
        return k;
    }

    public static int drp()
    {
        int k = 0;
        for(int i = 0; i < 60; i++)
            if(aA[i] > 0 && (aA[i] & 0x40) != 64 && !sND(i))
            {
                aA[i] |= 0x10;
                aA[i] &= 0x18ffff;
                k++;
            }

        for(int j = 59; j >= 0; j--)
            if(aA[j] > 0)
            {
                if((aA[j] & 0x40) == 64)
                    aA[j] &= 0xffffffbf;
                if((aA[j] & 0x10) == 16)
                {
                    int l = 0;
                    if(aA[((j / 6) * 6 + 6) - 1] == -1)
                        l = 1;
                    if((aA[j] & 0x80000) > 0 && aA[j + 6 + l] > 0 && (aA[j + 6 + l] & 0x10) == 0)
                    {
                        aA[j] &= 0xffffffef;
                        k--;
                    }
                    if((aA[j] & 0x100000) > 0 && aA[j + 5 + l] > 0 && (aA[j + 5 + l] & 0x10) == 0)
                    {
                        aA[j] &= 0xffffffef;
                        k--;
                    }
                }
            }

        nA -= k;
        return k;
    }

    private static int sNB(int i)
    {
        int j2 = 0;
        int j = 0;
        if(aA[((i / 6) * 6 + 6) - 1] == -1)
            j = 1;
        if((aA[i] & 0xff00) >= 256)
        {
            if((aA[i] & 0x10) != 16)
            {
                aA[i] |= 0x10;
                j2++;
            }
            for(int k2 = 256; k2 < 16384; k2 <<= 1)
            {
                int k = aA[i] & 0xff00 & k2;
                aA[i] &= ~k;
                if(k == 256)
                {
                    int l = (i - 7) + j;
                    j2 += sNB(l);
                } else
                if(k == 512)
                {
                    int i1 = (i - 6) + j;
                    j2 += sNB(i1);
                } else
                if(k == 1024)
                {
                    int j1 = i + 1;
                    j2 += sNB(j1);
                } else
                if(k == 2048)
                {
                    int k1 = i + 6 + j;
                    j2 += sNB(k1);
                } else
                if(k == 4096)
                {
                    int l1 = i + 5 + j;
                    j2 += sNB(l1);
                } else
                if(k == 8192)
                {
                    int i2 = i - 1;
                    j2 += sNB(i2);
                }
            }

        }
        return j2;
    }

    private static boolean sND(int i)
    {
        if(aA[i] == -1)
            return true;
        if(i >= 0 && i < 6)
            return true;
        if((aA[i] & 0x40) == 64)
            return true;
        boolean flag = false;
        int j = 0;
        if(aA[((i / 6) * 6 + 6) - 1] == -1)
            j = 1;
        for(int l1 = 0x10000; l1 < 0x400000; l1 <<= 1)
        {
            int k = aA[i] & 0xff0000 & l1;
            if(k == 0x10000)
            {
                aA[i] &= ~k;
                int l = (i - 7) + j;
                flag = sND(l);
                aA[i] |= k;
            } else
            if(k == 0x20000)
            {
                aA[i] &= ~k;
                int i1 = (i - 6) + j;
                flag = sND(i1);
                aA[i] |= k;
            } else
            if(k == 0x40000)
            {
                aA[i] &= ~k;
                int j1 = i + 1;
                flag = sND(j1);
                aA[i] |= k;
            } else
            if(k == 0x200000)
            {
                aA[i] &= ~k;
                int k1 = i - 1;
                flag = sND(k1);
                aA[i] |= k;
            }
            if(!flag)
                continue;
            aA[i] |= 0x40;
            break;
        }

        return flag;
    }

    public static void cBA(int i)
    {
        int j1 = 0;
        if(aA[((i / 6) * 6 + 6) - 1] == -1)
            j1 = 1;
        if((aA[i] & 0x10000) == 0x10000)
        {
            int j = (i - 7) + j1;
            aA[j] &= 0xfff7ffff;
        }
        if((aA[i] & 0x20000) == 0x20000)
        {
            int k = (i - 6) + j1;
            aA[k] &= 0xffefffff;
        }
        if((aA[i] & 0x40000) == 0x40000)
            aA[i + 1] &= 0xffdfffff;
        if((aA[i] & 0x80000) == 0x80000)
        {
            int l = i + 6 + j1;
            aA[l] &= 0xfffeffff;
        }
        if((aA[i] & 0x100000) == 0x100000)
        {
            int i1 = i + 5 + j1;
            aA[i1] &= 0xfffdffff;
        }
        if((aA[i] & 0x200000) == 0x200000)
            aA[i - 1] &= 0xfffbffff;
        aA[i] = 0;
    }

    private static void sCk()
    {
        cL = 0;
        for(int k = 8; k >= 0; k--)
        {
            int l = k * 6;
            if((aA[l] & 0xf) > 0)
            {
                aG = 0;
                if(aA[l + 5] == -1)
                    aG = 1;
                for(int i = 0; i < 60; i++)
                    if((l = sCs(l)) < 0)
                        return;

            }
        }

        for(int i1 = 0; i1 < 6; i1++)
        {
            if(aA[i1] == -1)
                break;
            if((aA[i1] & 0xf) > 0)
            {
                aG = 2;
                for(int j = 0; j < 60; j++)
                    if((i1 = sCs(i1)) < 0)
                        return;

            }
        }

        if((cL & 0x10) == 0)
            cL = 1;
    }

    private static int sCs(int i)
    {
        int k = i;
        aG -= 3;
        if(aG < 0)
            aG += 6;
        if(aA[k] > 0)
            cL |= 1 << (aA[k] & 0xf) - 1;
        for(int l = 5; l-- >= 0;)
        {
            aG--;
            if(aG < 0)
                aG += 6;
            int j = 0;
            if(aA[((i / 6) * 6 + 6) - 1] == -1)
                j = 1;
            if(aG == 0)
                k = (i - 7) + j;
            else
            if(aG == 1)
                k = (i - 6) + j;
            else
            if(aG == 2)
                k = i + 1;
            else
            if(aG == 3)
                k = i + 6 + j;
            else
            if(aG == 4)
                k = i + 5 + j;
            else
            if(aG == 5)
                k = i - 1;
            if(j != 1 ? i > ((i / 6) * 6 + 6) - 1 : i > ((i / 6) * 6 + 6) - 2)
                break;
            if(k < 0)
            {
                k = i;
                for(k++; ++k <= 5;)
                    if((aA[k] & 0xf) > 0)
                    {
                        aG = 2;
                        return k;
                    }

                break;
            }
            if(k >= 60)
                return -1;
            if((aA[k] & 0xf) > 0)
                return k;
        }

        return -1;
    }

}
