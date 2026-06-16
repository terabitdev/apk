package com.google.android.gms.internal.measurement;

import android.os.Build;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class k3 extends o5 {
    private static final k3 zzat;
    private int zzA;
    private String zzB;
    private String zzC;
    private boolean zzD;
    private t5 zzE;
    private String zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private String zzJ;
    private long zzK;
    private long zzL;
    private String zzM;
    private String zzN;
    private int zzO;
    private String zzP;
    private l3 zzQ;
    private r5 zzR;
    private long zzS;
    private long zzT;
    private String zzU;
    private String zzV;
    private int zzW;
    private boolean zzX;
    private String zzY;
    private boolean zzZ;
    private g3 zzaa;
    private String zzab;
    private t5 zzac;
    private String zzad;
    private long zzae;
    private boolean zzaf;
    private String zzag;
    private boolean zzah;
    private String zzai;
    private int zzaj;
    private String zzak;
    private s2 zzal;
    private int zzam;
    private p2 zzan;
    private String zzao;
    private r3 zzap;
    private long zzaq;
    private String zzar;
    private y2 zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private t5 zzf;
    private t5 zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private int zzq;
    private String zzr;
    private String zzs;
    private String zzt;
    private long zzu;
    private long zzv;
    private String zzw;
    private boolean zzx;
    private String zzy;
    private long zzz;

    static {
        k3 k3Var = new k3();
        zzat = k3Var;
        o5.l(k3.class, k3Var);
    }

    public k3() {
        o6 o6Var = o6.f3920n;
        this.zzf = o6Var;
        this.zzg = o6Var;
        this.zzm = "";
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzr = "";
        this.zzs = "";
        this.zzt = "";
        this.zzw = "";
        this.zzy = "";
        this.zzB = "";
        this.zzC = "";
        this.zzE = o6Var;
        this.zzF = "";
        this.zzJ = "";
        this.zzM = "";
        this.zzN = "";
        this.zzP = "";
        this.zzR = p5.f3929n;
        this.zzU = "";
        this.zzV = "";
        this.zzY = "";
        this.zzab = "";
        this.zzac = o6Var;
        this.zzad = "";
        this.zzag = "";
        this.zzai = "";
        this.zzak = "";
        this.zzao = "";
        this.zzar = "";
    }

    public static j3 T() {
        return (j3) zzat.g();
    }

    public static j3 U(k3 k3Var) {
        n5 g = zzat.g();
        g.e(k3Var);
        return (j3) g;
    }

    public final boolean A() {
        if ((this.zzb & 1048576) != 0) {
            return true;
        }
        return false;
    }

    public final String A0() {
        return this.zzag;
    }

    public final /* synthetic */ void A1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    public final int B() {
        return this.zzA;
    }

    public final boolean B0() {
        if ((this.zzd & 262144) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void B1(String str) {
        this.zzb |= 262144;
        this.zzy = str;
    }

    public final String C() {
        return this.zzB;
    }

    public final boolean C0() {
        return this.zzah;
    }

    public final /* synthetic */ void C1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    public final String D() {
        return this.zzC;
    }

    public final boolean D0() {
        if ((this.zzd & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void D1(long j) {
        this.zzb |= 524288;
        this.zzz = j;
    }

    public final boolean E() {
        if ((this.zzb & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final String E0() {
        return this.zzai;
    }

    public final /* synthetic */ void E1(int i) {
        this.zzb |= 1048576;
        this.zzA = i;
    }

    public final boolean F() {
        return this.zzD;
    }

    public final int F0() {
        return this.zzaj;
    }

    public final /* synthetic */ void F1(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    public final t5 G() {
        return this.zzE;
    }

    public final boolean G0() {
        if ((this.zzd & 4194304) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void G1() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    public final String H() {
        return this.zzF;
    }

    public final s2 H0() {
        s2 s2Var = this.zzal;
        if (s2Var == null) {
            return s2.w();
        }
        return s2Var;
    }

    public final /* synthetic */ void H1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    public final boolean I() {
        if ((this.zzb & GroupFlagsKt.HasAuxSlotFlag) != 0) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        if ((this.zzd & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void I1() {
        this.zzb |= 8388608;
        this.zzD = false;
    }

    public final int J() {
        return this.zzG;
    }

    public final int J0() {
        return this.zzam;
    }

    public final void J1(ArrayList arrayList) {
        t5 t5Var = this.zzE;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzE = t5Var.k(size + size);
        }
        u4.c(arrayList, this.zzE);
    }

    public final boolean K() {
        if ((this.zzb & GroupFlagsKt.HasMovableContentFlag) != 0) {
            return true;
        }
        return false;
    }

    public final boolean K0() {
        if ((this.zzd & 16777216) != 0) {
            return true;
        }
        return false;
    }

    public final void K1() {
        this.zzE = o6.f3920n;
    }

    public final long L() {
        return this.zzK;
    }

    public final p2 L0() {
        p2 p2Var = this.zzan;
        if (p2Var == null) {
            return p2.O();
        }
        return p2Var;
    }

    public final /* synthetic */ void L1(String str) {
        this.zzb |= 16777216;
        this.zzF = str;
    }

    public final boolean M() {
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean M0() {
        if ((this.zzd & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void M1(int i) {
        this.zzb |= GroupFlagsKt.HasAuxSlotFlag;
        this.zzG = i;
    }

    public final String N() {
        return this.zzM;
    }

    public final r3 N0() {
        r3 r3Var = this.zzap;
        if (r3Var == null) {
            return r3.q();
        }
        return r3Var;
    }

    public final /* synthetic */ void N1() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    public final boolean O() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int O0() {
        return this.zze;
    }

    public final List O1() {
        return this.zzf;
    }

    public final boolean P() {
        if ((this.zzd & GroupFlagsKt.HasRecompositionRequiredFlag) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void P0(long j) {
        this.zzb |= GroupFlagsKt.HasMovableContentFlag;
        this.zzK = j;
    }

    public final void P1() {
        t5 t5Var = this.zzf;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzf = t5Var.k(size + size);
        }
    }

    public final long Q() {
        return this.zzaq;
    }

    public final /* synthetic */ void Q0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    public final void Q1() {
        t5 t5Var = this.zzg;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzg = t5Var.k(size + size);
        }
    }

    public final boolean R() {
        if ((this.zzd & GroupFlagsKt.HasMovableContentFlag) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void R0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    public final int R1() {
        return this.zzf.size();
    }

    public final y2 S() {
        y2 y2Var = this.zzas;
        if (y2Var == null) {
            return y2.q();
        }
        return y2Var;
    }

    public final /* synthetic */ void S0(int i) {
        this.zzd |= 2;
        this.zzO = i;
    }

    public final c3 S1(int i) {
        return (c3) this.zzf.get(i);
    }

    public final void T0(ArrayList arrayList) {
        List list = this.zzR;
        if (!((v4) list).f3994a) {
            int size = list.size();
            this.zzR = ((p5) list).k(size + size);
        }
        u4.c(arrayList, this.zzR);
    }

    public final t5 T1() {
        return this.zzg;
    }

    public final /* synthetic */ void U0(long j) {
        this.zzd |= 16;
        this.zzS = j;
    }

    public final int U1() {
        return this.zzg.size();
    }

    public final /* synthetic */ void V() {
        this.zzb |= 1;
        this.zze = 1;
    }

    public final /* synthetic */ void V0(long j) {
        this.zzd |= 32;
        this.zzT = j;
    }

    public final t3 V1(int i) {
        return (t3) this.zzg.get(i);
    }

    public final /* synthetic */ void W(int i, c3 c3Var) {
        P1();
        this.zzf.set(i, c3Var);
    }

    public final /* synthetic */ void W0(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final boolean W1() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void X(c3 c3Var) {
        P1();
        this.zzf.add(c3Var);
    }

    public final /* synthetic */ void X0(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    public final long X1() {
        return this.zzh;
    }

    public final /* synthetic */ void Y(Iterable iterable) {
        P1();
        u4.c(iterable, this.zzf);
    }

    public final /* synthetic */ void Y0() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final boolean Y1() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final void Z() {
        this.zzf = o6.f3920n;
    }

    public final void Z0(Set set) {
        t5 t5Var = this.zzac;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzac = t5Var.k(size + size);
        }
        u4.c(set, this.zzac);
    }

    public final long Z1() {
        return this.zzi;
    }

    public final /* synthetic */ void a0(int i) {
        P1();
        this.zzf.remove(i);
    }

    public final /* synthetic */ void a1(String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    public final boolean a2() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void b0(int i, t3 t3Var) {
        Q1();
        this.zzg.set(i, t3Var);
    }

    public final /* synthetic */ void b1(long j) {
        this.zzd |= 32768;
        this.zzae = j;
    }

    public final long b2() {
        return this.zzj;
    }

    public final /* synthetic */ void c0(t3 t3Var) {
        Q1();
        this.zzg.add(t3Var);
    }

    public final /* synthetic */ void c1(boolean z10) {
        this.zzd |= 65536;
        this.zzaf = z10;
    }

    public final boolean c2() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void d0(int i) {
        Q1();
        this.zzg.remove(i);
    }

    public final /* synthetic */ void d1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    public final long d2() {
        return this.zzk;
    }

    public final /* synthetic */ void e0(long j) {
        this.zzb |= 2;
        this.zzh = j;
    }

    public final /* synthetic */ void e1(boolean z10) {
        this.zzd |= 262144;
        this.zzah = z10;
    }

    public final boolean e2() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void f0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    public final /* synthetic */ void f1(String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }

    public final long f2() {
        return this.zzl;
    }

    public final /* synthetic */ void g0(long j) {
        this.zzb |= 4;
        this.zzi = j;
    }

    public final /* synthetic */ void g1(int i) {
        this.zzd |= 1048576;
        this.zzaj = i;
    }

    public final String g2() {
        return this.zzm;
    }

    public final /* synthetic */ void h0(long j) {
        this.zzb |= 8;
        this.zzj = j;
    }

    public final /* synthetic */ void h1(s2 s2Var) {
        this.zzal = s2Var;
        this.zzd |= 4194304;
    }

    public final String h2() {
        return this.zzn;
    }

    public final /* synthetic */ void i0(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    public final /* synthetic */ void i1(int i) {
        this.zzd |= 8388608;
        this.zzam = i;
    }

    public final String i2() {
        return this.zzo;
    }

    public final /* synthetic */ void j0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    public final /* synthetic */ void j1(p2 p2Var) {
        this.zzan = p2Var;
        this.zzd |= 16777216;
    }

    public final String j2() {
        return this.zzp;
    }

    public final /* synthetic */ void k0(long j) {
        this.zzb |= 32;
        this.zzl = j;
    }

    public final /* synthetic */ void k1(r3 r3Var) {
        this.zzap = r3Var;
        this.zzd |= 67108864;
    }

    public final boolean k2() {
        if ((this.zzb & 1024) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void l0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    public final /* synthetic */ void l1(long j) {
        this.zzd |= GroupFlagsKt.HasRecompositionRequiredFlag;
        this.zzaq = j;
    }

    public final int l2() {
        return this.zzq;
    }

    public final /* synthetic */ void m0() {
        this.zzb |= 64;
        this.zzm = "android";
    }

    public final /* synthetic */ void m1() {
        this.zzd |= GroupFlagsKt.IsMovableContentFlag;
        this.zzar = "";
    }

    public final String m2() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzat;
                        }
                        throw null;
                    }
                    return new n5(zzat);
                }
                return new k3();
            }
            return new p6(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", c3.class, "zzg", t3.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", u2.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", t1.g, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void n0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    public final /* synthetic */ void n1(y2 y2Var) {
        this.zzas = y2Var;
        this.zzd |= GroupFlagsKt.HasMovableContentFlag;
    }

    public final String o() {
        return this.zzs;
    }

    public final boolean o0() {
        if ((this.zzd & 2) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void o1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    public final String p() {
        return this.zzt;
    }

    public final int p0() {
        return this.zzO;
    }

    public final /* synthetic */ void p1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    public final boolean q() {
        if ((this.zzb & 16384) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q0() {
        if ((this.zzd & 16) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void q1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    public final long r() {
        return this.zzu;
    }

    public final long r0() {
        return this.zzS;
    }

    public final /* synthetic */ void r1(int i) {
        this.zzb |= 1024;
        this.zzq = i;
    }

    public final boolean s() {
        if ((this.zzb & 32768) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s0() {
        if ((this.zzd & 128) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void s1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzr = str;
    }

    public final long t() {
        return this.zzv;
    }

    public final String t0() {
        return this.zzV;
    }

    public final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzs = str;
    }

    public final String u() {
        return this.zzw;
    }

    public final boolean u0() {
        if ((this.zzd & 8192) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void u1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    public final boolean v() {
        if ((this.zzb & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final String v0() {
        return this.zzab;
    }

    public final /* synthetic */ void v1(long j) {
        this.zzb |= 16384;
        this.zzu = j;
    }

    public final boolean w() {
        return this.zzx;
    }

    public final boolean w0() {
        if ((this.zzd & 32768) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void w1() {
        this.zzb |= 32768;
        this.zzv = 133005L;
    }

    public final String x() {
        return this.zzy;
    }

    public final long x0() {
        return this.zzae;
    }

    public final /* synthetic */ void x1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzw = str;
    }

    public final boolean y() {
        if ((this.zzb & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y0() {
        return this.zzaf;
    }

    public final /* synthetic */ void y1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }

    public final long z() {
        return this.zzz;
    }

    public final boolean z0() {
        if ((this.zzd & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void z1(boolean z10) {
        this.zzb |= 131072;
        this.zzx = z10;
    }
}
