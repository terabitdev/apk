package com.google.android.gms.internal.measurement;

import androidx.window.core.layout.WindowSizeClass;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class c7 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3727a = 0;

    static {
        if (a7.f3704e && a7.f3703d) {
            int i = w4.f4033a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(int i, int i3, byte[] bArr) {
        while (i < i3 && bArr[i] >= 0) {
            i++;
        }
        if (i < i3) {
            while (i < i3) {
                int i8 = i + 1;
                int i10 = bArr[i];
                if (i10 < 0) {
                    if (i10 < -32) {
                        if (i8 < i3) {
                            if (i10 >= -62) {
                                i += 2;
                                if (bArr[i8] > -65) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            if (i10 != 0) {
                                return false;
                            }
                            return true;
                        }
                    } else if (i10 < -16) {
                        if (i8 >= i3 - 1) {
                            i10 = d(i8, i3, bArr);
                            if (i10 != 0) {
                            }
                        } else {
                            int i11 = i + 2;
                            char c10 = bArr[i8];
                            if (c10 <= -65) {
                                if (i10 != -32 || c10 >= -96) {
                                    if (i10 != -19 || c10 < -96) {
                                        i += 3;
                                        if (bArr[i11] > -65) {
                                            return false;
                                        }
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                    } else if (i8 >= i3 - 2) {
                        i10 = d(i8, i3, bArr);
                        if (i10 != 0) {
                        }
                    } else {
                        int i12 = i + 2;
                        int i13 = bArr[i8];
                        if (i13 <= -65) {
                            if ((((i13 + 112) + (i10 << 28)) >> 30) == 0) {
                                int i14 = i + 3;
                                if (bArr[i12] <= -65) {
                                    i += 4;
                                    if (bArr[i14] > -65) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    i = i8;
                }
            }
            return true;
        }
        return true;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i8 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = str.charAt(i3);
            if (charAt < 2048) {
                i8 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = str.length();
                while (i3 < length2) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) >= 65536) {
                                i3++;
                            } else {
                                throw new b7(i3, length2);
                            }
                        }
                    }
                    i3++;
                }
                i8 += i;
            }
        }
        if (i8 >= length) {
            return i8;
        }
        long j = i8 + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(String str, byte[] bArr, int i, int i3) {
        int i8;
        int i10;
        int i11;
        char charAt;
        int length = str.length();
        int i12 = 0;
        while (true) {
            i8 = i + i3;
            if (i12 >= length || (i11 = i12 + i) >= i8 || (charAt = str.charAt(i12)) >= 128) {
                break;
            }
            bArr[i11] = (byte) charAt;
            i12++;
        }
        int i13 = i + i12;
        while (i12 < length) {
            char charAt2 = str.charAt(i12);
            if (charAt2 < 128 && i13 < i8) {
                bArr[i13] = (byte) charAt2;
                i13++;
            } else if (charAt2 < 2048 && i13 <= i8 - 2) {
                bArr[i13] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                i13 += 2;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i13 <= i8 - 3) {
                bArr[i13] = (byte) ((charAt2 >>> '\f') | WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
                bArr[i13 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i13 + 2] = (byte) ((charAt2 & '?') | 128);
                i13 += 3;
            } else {
                if (i13 <= i8 - 4) {
                    int i14 = i12 + 1;
                    if (i14 != str.length()) {
                        char charAt3 = str.charAt(i14);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i15 = i13 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i13 += 4;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i12 = i14;
                        } else {
                            i12 = i14;
                        }
                    }
                    throw new b7(i12 - 1, length);
                }
                if (charAt2 >= 55296 && charAt2 <= 57343 && ((i10 = i12 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i10)))) {
                    throw new b7(i12, length);
                }
                StringBuilder sb = new StringBuilder(String.valueOf(charAt2).length() + 25 + String.valueOf(i13).length());
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i13);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            i12++;
        }
        return i13;
    }

    public static /* synthetic */ int d(int i, int i3, byte[] bArr) {
        int i8 = i3 - i;
        byte b10 = bArr[i - 1];
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    byte b11 = bArr[i];
                    byte b12 = bArr[i + 1];
                    if (b10 <= -12 && b11 <= -65 && b12 <= -65) {
                        return (b12 << 16) ^ ((b11 << 8) ^ b10);
                    }
                    return -1;
                }
                throw new AssertionError();
            }
            byte b13 = bArr[i];
            if (b10 <= -12 && b13 <= -65) {
                return (b13 << 8) ^ b10;
            }
            return -1;
        }
        if (b10 <= -12) {
            return b10;
        }
        return -1;
    }
}
