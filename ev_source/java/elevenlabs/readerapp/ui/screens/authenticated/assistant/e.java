package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import f4.e2;
import f4.s1;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeStateV3;
import java.util.ArrayList;
import java.util.List;
import m2.f1;
import m2.g1;
import m2.h1;
import m2.w0;
import q2.j5;
import q2.k5;
import q2.l5;
import r1.b3;
import r1.d2;
import r1.e1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15105a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15110f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f15111x0;

    public /* synthetic */ e(int i10, ho.p pVar, c3.j jVar, ho.p pVar2, w0 w0Var, ho.p pVar3, ho.q qVar, h1 h1Var) {
        this.f15107c = i10;
        this.f15108d = pVar;
        this.f15109e = jVar;
        this.f15110f = pVar2;
        this.f15106b = w0Var;
        this.Y = pVar3;
        this.Z = qVar;
        this.f15111x0 = h1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0428 A[LOOP:3: B:113:0x0426->B:114:0x0428, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0520 A[LOOP:4: B:140:0x051e->B:141:0x0520, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0442  */
    @Override // ho.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        sn.z AskAssistantSheetUI$lambda$3;
        sn.z HomeSectionContent$lambda$11;
        boolean z6;
        Object obj3;
        ArrayList arrayList;
        int i10;
        final int i11;
        Object obj4;
        int i12;
        ca.e eVar;
        ArrayList arrayList2;
        int size;
        int i13;
        Object obj5;
        ArrayList arrayList3;
        s1 s1Var;
        Integer num;
        Integer num2;
        int i14;
        e1 e1Var;
        float a10;
        int size2;
        int i15;
        int b10;
        int intValue;
        int B;
        Object obj6;
        int i16;
        Object obj7;
        int i17;
        int i18;
        int B2;
        s1 s1Var2;
        int B3;
        int B4;
        int i19;
        final ca.e eVar2;
        boolean z10;
        Integer num3;
        float S;
        float S2;
        Integer num4;
        int b11;
        int B5;
        int b12;
        switch (this.f15105a) {
            case 0:
                AskAssistantSheetUI$lambda$3 = AskAssistantSheetKt.AskAssistantSheetUI$lambda$3((String) this.f15108d, (AssistantContract.State) this.f15110f, (ho.l) this.f15106b, (ho.a) this.Y, (j.j) this.f15111x0, (ho.a) this.Z, (String) this.f15109e, this.f15107c, (u2.m) obj, ((Integer) obj2).intValue());
                return AskAssistantSheetUI$lambda$3;
            case 1:
                HomeSectionContent$lambda$11 = HomeScreenV3Kt.HomeSectionContent$lambda$11((t1.b) this.f15108d, (HomePageV3.Section) this.f15109e, (HomeStateV3) this.f15110f, (ho.l) this.f15106b, (ho.l) this.Y, (ho.l) this.Z, (i3.t) this.f15111x0, this.f15107c, (u2.m) obj, ((Integer) obj2).intValue());
                return HomeSectionContent$lambda$11;
            case 2:
                ho.p pVar = (ho.p) this.f15108d;
                c3.j jVar = (c3.j) this.f15109e;
                ho.p pVar2 = (ho.p) this.f15110f;
                w0 w0Var = (w0) this.f15106b;
                ho.p pVar3 = (ho.p) this.Y;
                ho.q qVar = (ho.q) this.Z;
                h1 h1Var = (h1) this.f15111x0;
                u2.m mVar = (u2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                u2.q qVar2 = (u2.q) mVar;
                if (qVar2.O(intValue2 & 1, z6)) {
                    f1.c(this.f15107c, pVar, jVar, c3.k.d(545329543, true, new f2.i(qVar, h1Var, 15), qVar2), pVar2, w0Var, pVar3, qVar2, 24576);
                } else {
                    qVar2.R();
                }
                return sn.z.f31622a;
            case 3:
                ho.p pVar4 = (ho.p) this.f15108d;
                c3.j jVar2 = (c3.j) this.f15109e;
                ho.p pVar5 = (ho.p) this.f15110f;
                b3 b3Var = (b3) this.f15106b;
                m2.e1 e1Var2 = (m2.e1) this.Y;
                ho.p pVar6 = (ho.p) this.Z;
                c3.j jVar3 = (c3.j) this.f15111x0;
                e2 e2Var = (e2) obj;
                h5.a aVar = (h5.a) obj2;
                float f10 = f1.f22529b;
                int h10 = h5.a.h(aVar.f12077a);
                final int g10 = h5.a.g(aVar.f12077a);
                long a11 = h5.a.a(aVar.f12077a, 0, 0, 0, 0, 10);
                List a02 = e2Var.a0(g1.f22539a, pVar4);
                ArrayList arrayList4 = new ArrayList(a02.size());
                int size3 = a02.size();
                int i20 = 0;
                while (i20 < size3) {
                    arrayList4.add(((f4.e1) a02.get(i20)).V(a11));
                    i20++;
                    a02 = a02;
                }
                int i21 = 1;
                if (arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                    i10 = 1;
                    obj3 = null;
                } else {
                    obj3 = arrayList4.get(0);
                    int i22 = ((s1) obj3).f8869b;
                    int size4 = arrayList4.size() - 1;
                    if (1 <= size4) {
                        i10 = 1;
                        while (true) {
                            Object obj8 = arrayList4.get(i21);
                            arrayList = arrayList4;
                            int i23 = ((s1) obj8).f8869b;
                            if (i22 < i23) {
                                i22 = i23;
                                obj3 = obj8;
                            }
                            if (i21 != size4) {
                                i21++;
                                arrayList4 = arrayList;
                            }
                        }
                    } else {
                        arrayList = arrayList4;
                        i10 = 1;
                    }
                }
                s1 s1Var3 = (s1) obj3;
                if (s1Var3 != null) {
                    i11 = s1Var3.f8869b;
                } else {
                    i11 = 0;
                }
                List a03 = e2Var.a0(g1.f22541c, jVar2);
                ArrayList arrayList5 = new ArrayList(a03.size());
                int size5 = a03.size();
                int i24 = 0;
                while (i24 < size5) {
                    arrayList5.add(((f4.e1) a03.get(i24)).V(h5.b.i(a11, (-b3Var.c(e2Var, e2Var.getLayoutDirection())) - b3Var.d(e2Var, e2Var.getLayoutDirection()), -b3Var.b(e2Var))));
                    i24++;
                    a03 = a03;
                    size5 = size5;
                    e1Var2 = e1Var2;
                    pVar6 = pVar6;
                }
                m2.e1 e1Var3 = e1Var2;
                ho.p pVar7 = pVar6;
                if (arrayList5.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList5.get(0);
                    int i25 = ((s1) obj4).f8869b;
                    int size6 = arrayList5.size() - 1;
                    if (i10 <= size6) {
                        int i26 = 1;
                        while (true) {
                            Object obj9 = arrayList5.get(i26);
                            int i27 = ((s1) obj9).f8869b;
                            if (i25 < i27) {
                                obj4 = obj9;
                                i25 = i27;
                            }
                            if (i26 != size6) {
                                i26++;
                            }
                        }
                    }
                }
                s1 s1Var4 = (s1) obj4;
                if (s1Var4 != null) {
                    i12 = s1Var4.f8869b;
                } else {
                    i12 = 0;
                }
                List a04 = e2Var.a0(g1.f22542d, pVar5);
                final ArrayList arrayList6 = new ArrayList(a04.size());
                int size7 = a04.size();
                int i28 = 0;
                while (i28 < size7) {
                    arrayList6.add(((f4.e1) a04.get(i28)).V(h5.b.i(a11, (-b3Var.c(e2Var, e2Var.getLayoutDirection())) - b3Var.d(e2Var, e2Var.getLayoutDirection()), -b3Var.b(e2Var))));
                    i28++;
                    i12 = i12;
                    arrayList5 = arrayList5;
                }
                int i29 = i12;
                final ArrayList arrayList7 = arrayList5;
                if (!arrayList6.isEmpty()) {
                    if (arrayList6.isEmpty()) {
                        obj6 = null;
                    } else {
                        obj6 = arrayList6.get(0);
                        int i30 = ((s1) obj6).f8868a;
                        int size8 = arrayList6.size() - 1;
                        if (1 <= size8) {
                            int i31 = 1;
                            while (true) {
                                Object obj10 = arrayList6.get(i31);
                                int i32 = ((s1) obj10).f8868a;
                                if (i30 < i32) {
                                    obj6 = obj10;
                                    i30 = i32;
                                }
                                if (i31 != size8) {
                                    i31++;
                                }
                            }
                        }
                    }
                    s1 s1Var5 = (s1) obj6;
                    if (s1Var5 != null) {
                        i16 = s1Var5.f8868a;
                    } else {
                        i16 = 0;
                    }
                    if (arrayList6.isEmpty()) {
                        obj7 = null;
                    } else {
                        obj7 = arrayList6.get(0);
                        int i33 = ((s1) obj7).f8869b;
                        int size9 = arrayList6.size() - 1;
                        if (1 <= size9) {
                            int i34 = 1;
                            while (true) {
                                Object obj11 = arrayList6.get(i34);
                                int i35 = ((s1) obj11).f8869b;
                                if (i33 < i35) {
                                    obj7 = obj11;
                                    i33 = i35;
                                }
                                if (i34 != size9) {
                                    i34++;
                                }
                            }
                        }
                    }
                    s1 s1Var6 = (s1) obj7;
                    if (s1Var6 != null) {
                        i17 = s1Var6.f8869b;
                    } else {
                        i17 = 0;
                    }
                    if (i16 != 0 && i17 != 0) {
                        h5.m mVar2 = h5.m.f12093a;
                        int i36 = this.f15107c;
                        if (i36 == 0) {
                            if (e2Var.getLayoutDirection() == mVar2) {
                                i18 = e2Var.B(f10);
                                eVar = new ca.e(i18, i17);
                                List a05 = e2Var.a0(g1.f22543e, new c3.j(new f2.i(eVar, pVar7, 16), true, -502652347));
                                arrayList2 = new ArrayList(a05.size());
                                size = a05.size();
                                for (i13 = 0; i13 < size; i13++) {
                                    arrayList2.add(((f4.e1) a05.get(i13)).V(a11));
                                }
                                if (!arrayList2.isEmpty()) {
                                    arrayList3 = arrayList2;
                                    obj5 = null;
                                } else {
                                    obj5 = arrayList2.get(0);
                                    int i37 = ((s1) obj5).f8869b;
                                    int size10 = arrayList2.size() - 1;
                                    if (1 <= size10) {
                                        int i38 = 1;
                                        while (true) {
                                            Object obj12 = arrayList2.get(i38);
                                            arrayList3 = arrayList2;
                                            int i39 = ((s1) obj12).f8869b;
                                            if (i37 < i39) {
                                                i37 = i39;
                                                obj5 = obj12;
                                            }
                                            if (i38 != size10) {
                                                i38++;
                                                arrayList2 = arrayList3;
                                            }
                                        }
                                    } else {
                                        arrayList3 = arrayList2;
                                    }
                                }
                                s1Var = (s1) obj5;
                                if (s1Var == null) {
                                    num = Integer.valueOf(s1Var.f8869b);
                                } else {
                                    num = null;
                                }
                                if (eVar == null) {
                                    int i40 = eVar.f4953b;
                                    if (num == null) {
                                        intValue = e2Var.B(f10) + i40;
                                        B = b3Var.b(e2Var);
                                    } else {
                                        intValue = num.intValue() + i40;
                                        B = e2Var.B(f10);
                                    }
                                    num2 = Integer.valueOf(B + intValue);
                                } else {
                                    num2 = null;
                                }
                                if (i29 == 0) {
                                    if (num2 != null) {
                                        b10 = num2.intValue();
                                    } else if (num != null) {
                                        b10 = num.intValue();
                                    } else {
                                        b10 = b3Var.b(e2Var);
                                    }
                                    i14 = i29 + b10;
                                } else {
                                    i14 = 0;
                                }
                                e1Var = new e1(b3Var, e2Var);
                                float d10 = !arrayList.isEmpty() ? e1Var.d() : 0;
                                if (arrayList3.isEmpty() && num != null) {
                                    a10 = e2Var.S(num.intValue());
                                } else {
                                    a10 = e1Var.a();
                                }
                                e1Var3.f22512a.setValue(new d2(r1.d.m(e1Var, e2Var.getLayoutDirection()), d10, r1.d.l(e1Var, e2Var.getLayoutDirection()), a10));
                                int i41 = g10 - i11;
                                List a06 = e2Var.a0(g1.f22540b, new c3.j(new f2.i(jVar3, e1Var3, 14), true, -574531306));
                                final ArrayList arrayList8 = new ArrayList(a06.size());
                                size2 = a06.size();
                                i15 = 0;
                                while (i15 < size2) {
                                    long j4 = a11;
                                    arrayList8.add(((f4.e1) a06.get(i15)).V(h5.a.a(j4, 0, 0, 0, i41, 7)));
                                    i15++;
                                    a11 = j4;
                                }
                                final Integer num5 = num;
                                final int i42 = i14;
                                final ca.e eVar3 = eVar;
                                final Integer num6 = num2;
                                final ArrayList arrayList9 = arrayList;
                                final ArrayList arrayList10 = arrayList3;
                                return e2Var.Z(h10, g10, tn.u.f33548a, new ho.l() { // from class: m2.a1
                                    @Override // ho.l
                                    public final Object invoke(Object obj13) {
                                        int i43;
                                        int i44;
                                        int i45;
                                        int i46;
                                        f4.r1 r1Var = (f4.r1) obj13;
                                        ArrayList arrayList11 = arrayList8;
                                        int size11 = arrayList11.size();
                                        for (int i47 = 0; i47 < size11; i47++) {
                                            r1Var.k((f4.s1) arrayList11.get(i47), 0, i11, t2.u.P);
                                        }
                                        ArrayList arrayList12 = arrayList9;
                                        int size12 = arrayList12.size();
                                        for (int i48 = 0; i48 < size12; i48++) {
                                            r1Var.k((f4.s1) arrayList12.get(i48), 0, 0, t2.u.P);
                                        }
                                        ArrayList arrayList13 = arrayList7;
                                        int size13 = arrayList13.size();
                                        int i49 = 0;
                                        while (true) {
                                            i43 = g10;
                                            if (i49 >= size13) {
                                                break;
                                            }
                                            r1Var.k((f4.s1) arrayList13.get(i49), 0, i43 - i42, t2.u.P);
                                            i49++;
                                        }
                                        ArrayList arrayList14 = arrayList10;
                                        int size14 = arrayList14.size();
                                        for (int i50 = 0; i50 < size14; i50++) {
                                            f4.s1 s1Var7 = (f4.s1) arrayList14.get(i50);
                                            Integer num7 = num5;
                                            if (num7 != null) {
                                                i46 = num7.intValue();
                                            } else {
                                                i46 = 0;
                                            }
                                            r1Var.k(s1Var7, 0, i43 - i46, t2.u.P);
                                        }
                                        ArrayList arrayList15 = arrayList6;
                                        int size15 = arrayList15.size();
                                        for (int i51 = 0; i51 < size15; i51++) {
                                            f4.s1 s1Var8 = (f4.s1) arrayList15.get(i51);
                                            ca.e eVar4 = eVar3;
                                            if (eVar4 != null) {
                                                i44 = eVar4.f4952a;
                                            } else {
                                                i44 = 0;
                                            }
                                            Integer num8 = num6;
                                            if (num8 != null) {
                                                i45 = num8.intValue();
                                            } else {
                                                i45 = 0;
                                            }
                                            r1Var.k(s1Var8, i44, i43 - i45, t2.u.P);
                                        }
                                        return sn.z.f31622a;
                                    }
                                });
                            }
                            B2 = e2Var.B(f10);
                            i18 = (h10 - B2) - i16;
                            eVar = new ca.e(i18, i17);
                            List a052 = e2Var.a0(g1.f22543e, new c3.j(new f2.i(eVar, pVar7, 16), true, -502652347));
                            arrayList2 = new ArrayList(a052.size());
                            size = a052.size();
                            while (i13 < size) {
                            }
                            if (!arrayList2.isEmpty()) {
                            }
                            s1Var = (s1) obj5;
                            if (s1Var == null) {
                            }
                            if (eVar == null) {
                            }
                            if (i29 == 0) {
                            }
                            e1Var = new e1(b3Var, e2Var);
                            if (!arrayList.isEmpty()) {
                            }
                            if (arrayList3.isEmpty()) {
                            }
                            a10 = e1Var.a();
                            e1Var3.f22512a.setValue(new d2(r1.d.m(e1Var, e2Var.getLayoutDirection()), d10, r1.d.l(e1Var, e2Var.getLayoutDirection()), a10));
                            int i412 = g10 - i11;
                            List a062 = e2Var.a0(g1.f22540b, new c3.j(new f2.i(jVar3, e1Var3, 14), true, -574531306));
                            final ArrayList arrayList82 = new ArrayList(a062.size());
                            size2 = a062.size();
                            i15 = 0;
                            while (i15 < size2) {
                            }
                            final Integer num52 = num;
                            final int i422 = i14;
                            final ca.e eVar32 = eVar;
                            final Integer num62 = num2;
                            final ArrayList arrayList92 = arrayList;
                            final ArrayList arrayList102 = arrayList3;
                            return e2Var.Z(h10, g10, tn.u.f33548a, new ho.l() { // from class: m2.a1
                                @Override // ho.l
                                public final Object invoke(Object obj13) {
                                    int i43;
                                    int i44;
                                    int i45;
                                    int i46;
                                    f4.r1 r1Var = (f4.r1) obj13;
                                    ArrayList arrayList11 = arrayList82;
                                    int size11 = arrayList11.size();
                                    for (int i47 = 0; i47 < size11; i47++) {
                                        r1Var.k((f4.s1) arrayList11.get(i47), 0, i11, t2.u.P);
                                    }
                                    ArrayList arrayList12 = arrayList92;
                                    int size12 = arrayList12.size();
                                    for (int i48 = 0; i48 < size12; i48++) {
                                        r1Var.k((f4.s1) arrayList12.get(i48), 0, 0, t2.u.P);
                                    }
                                    ArrayList arrayList13 = arrayList7;
                                    int size13 = arrayList13.size();
                                    int i49 = 0;
                                    while (true) {
                                        i43 = g10;
                                        if (i49 >= size13) {
                                            break;
                                        }
                                        r1Var.k((f4.s1) arrayList13.get(i49), 0, i43 - i422, t2.u.P);
                                        i49++;
                                    }
                                    ArrayList arrayList14 = arrayList102;
                                    int size14 = arrayList14.size();
                                    for (int i50 = 0; i50 < size14; i50++) {
                                        f4.s1 s1Var7 = (f4.s1) arrayList14.get(i50);
                                        Integer num7 = num52;
                                        if (num7 != null) {
                                            i46 = num7.intValue();
                                        } else {
                                            i46 = 0;
                                        }
                                        r1Var.k(s1Var7, 0, i43 - i46, t2.u.P);
                                    }
                                    ArrayList arrayList15 = arrayList6;
                                    int size15 = arrayList15.size();
                                    for (int i51 = 0; i51 < size15; i51++) {
                                        f4.s1 s1Var8 = (f4.s1) arrayList15.get(i51);
                                        ca.e eVar4 = eVar32;
                                        if (eVar4 != null) {
                                            i44 = eVar4.f4952a;
                                        } else {
                                            i44 = 0;
                                        }
                                        Integer num8 = num62;
                                        if (num8 != null) {
                                            i45 = num8.intValue();
                                        } else {
                                            i45 = 0;
                                        }
                                        r1Var.k(s1Var8, i44, i43 - i45, t2.u.P);
                                    }
                                    return sn.z.f31622a;
                                }
                            });
                        }
                        if (i36 == 2) {
                            if (e2Var.getLayoutDirection() == mVar2) {
                                B2 = e2Var.B(f10);
                                i18 = (h10 - B2) - i16;
                            } else {
                                i18 = e2Var.B(f10);
                            }
                        } else {
                            i18 = (h10 - i16) / 2;
                        }
                        eVar = new ca.e(i18, i17);
                        List a0522 = e2Var.a0(g1.f22543e, new c3.j(new f2.i(eVar, pVar7, 16), true, -502652347));
                        arrayList2 = new ArrayList(a0522.size());
                        size = a0522.size();
                        while (i13 < size) {
                        }
                        if (!arrayList2.isEmpty()) {
                        }
                        s1Var = (s1) obj5;
                        if (s1Var == null) {
                        }
                        if (eVar == null) {
                        }
                        if (i29 == 0) {
                        }
                        e1Var = new e1(b3Var, e2Var);
                        if (!arrayList.isEmpty()) {
                        }
                        if (arrayList3.isEmpty()) {
                        }
                        a10 = e1Var.a();
                        e1Var3.f22512a.setValue(new d2(r1.d.m(e1Var, e2Var.getLayoutDirection()), d10, r1.d.l(e1Var, e2Var.getLayoutDirection()), a10));
                        int i4122 = g10 - i11;
                        List a0622 = e2Var.a0(g1.f22540b, new c3.j(new f2.i(jVar3, e1Var3, 14), true, -574531306));
                        final ArrayList arrayList822 = new ArrayList(a0622.size());
                        size2 = a0622.size();
                        i15 = 0;
                        while (i15 < size2) {
                        }
                        final Integer num522 = num;
                        final int i4222 = i14;
                        final ca.e eVar322 = eVar;
                        final Integer num622 = num2;
                        final ArrayList arrayList922 = arrayList;
                        final ArrayList arrayList1022 = arrayList3;
                        return e2Var.Z(h10, g10, tn.u.f33548a, new ho.l() { // from class: m2.a1
                            @Override // ho.l
                            public final Object invoke(Object obj13) {
                                int i43;
                                int i44;
                                int i45;
                                int i46;
                                f4.r1 r1Var = (f4.r1) obj13;
                                ArrayList arrayList11 = arrayList822;
                                int size11 = arrayList11.size();
                                for (int i47 = 0; i47 < size11; i47++) {
                                    r1Var.k((f4.s1) arrayList11.get(i47), 0, i11, t2.u.P);
                                }
                                ArrayList arrayList12 = arrayList922;
                                int size12 = arrayList12.size();
                                for (int i48 = 0; i48 < size12; i48++) {
                                    r1Var.k((f4.s1) arrayList12.get(i48), 0, 0, t2.u.P);
                                }
                                ArrayList arrayList13 = arrayList7;
                                int size13 = arrayList13.size();
                                int i49 = 0;
                                while (true) {
                                    i43 = g10;
                                    if (i49 >= size13) {
                                        break;
                                    }
                                    r1Var.k((f4.s1) arrayList13.get(i49), 0, i43 - i4222, t2.u.P);
                                    i49++;
                                }
                                ArrayList arrayList14 = arrayList1022;
                                int size14 = arrayList14.size();
                                for (int i50 = 0; i50 < size14; i50++) {
                                    f4.s1 s1Var7 = (f4.s1) arrayList14.get(i50);
                                    Integer num7 = num522;
                                    if (num7 != null) {
                                        i46 = num7.intValue();
                                    } else {
                                        i46 = 0;
                                    }
                                    r1Var.k(s1Var7, 0, i43 - i46, t2.u.P);
                                }
                                ArrayList arrayList15 = arrayList6;
                                int size15 = arrayList15.size();
                                for (int i51 = 0; i51 < size15; i51++) {
                                    f4.s1 s1Var8 = (f4.s1) arrayList15.get(i51);
                                    ca.e eVar4 = eVar322;
                                    if (eVar4 != null) {
                                        i44 = eVar4.f4952a;
                                    } else {
                                        i44 = 0;
                                    }
                                    Integer num8 = num622;
                                    if (num8 != null) {
                                        i45 = num8.intValue();
                                    } else {
                                        i45 = 0;
                                    }
                                    r1Var.k(s1Var8, i44, i43 - i45, t2.u.P);
                                }
                                return sn.z.f31622a;
                            }
                        });
                    }
                }
                eVar = null;
                List a05222 = e2Var.a0(g1.f22543e, new c3.j(new f2.i(eVar, pVar7, 16), true, -502652347));
                arrayList2 = new ArrayList(a05222.size());
                size = a05222.size();
                while (i13 < size) {
                }
                if (!arrayList2.isEmpty()) {
                }
                s1Var = (s1) obj5;
                if (s1Var == null) {
                }
                if (eVar == null) {
                }
                if (i29 == 0) {
                }
                e1Var = new e1(b3Var, e2Var);
                if (!arrayList.isEmpty()) {
                }
                if (arrayList3.isEmpty()) {
                }
                a10 = e1Var.a();
                e1Var3.f22512a.setValue(new d2(r1.d.m(e1Var, e2Var.getLayoutDirection()), d10, r1.d.l(e1Var, e2Var.getLayoutDirection()), a10));
                int i41222 = g10 - i11;
                List a06222 = e2Var.a0(g1.f22540b, new c3.j(new f2.i(jVar3, e1Var3, 14), true, -574531306));
                final ArrayList arrayList8222 = new ArrayList(a06222.size());
                size2 = a06222.size();
                i15 = 0;
                while (i15 < size2) {
                }
                final Integer num5222 = num;
                final int i42222 = i14;
                final ca.e eVar3222 = eVar;
                final Integer num6222 = num2;
                final ArrayList arrayList9222 = arrayList;
                final ArrayList arrayList10222 = arrayList3;
                return e2Var.Z(h10, g10, tn.u.f33548a, new ho.l() { // from class: m2.a1
                    @Override // ho.l
                    public final Object invoke(Object obj13) {
                        int i43;
                        int i44;
                        int i45;
                        int i46;
                        f4.r1 r1Var = (f4.r1) obj13;
                        ArrayList arrayList11 = arrayList8222;
                        int size11 = arrayList11.size();
                        for (int i47 = 0; i47 < size11; i47++) {
                            r1Var.k((f4.s1) arrayList11.get(i47), 0, i11, t2.u.P);
                        }
                        ArrayList arrayList12 = arrayList9222;
                        int size12 = arrayList12.size();
                        for (int i48 = 0; i48 < size12; i48++) {
                            r1Var.k((f4.s1) arrayList12.get(i48), 0, 0, t2.u.P);
                        }
                        ArrayList arrayList13 = arrayList7;
                        int size13 = arrayList13.size();
                        int i49 = 0;
                        while (true) {
                            i43 = g10;
                            if (i49 >= size13) {
                                break;
                            }
                            r1Var.k((f4.s1) arrayList13.get(i49), 0, i43 - i42222, t2.u.P);
                            i49++;
                        }
                        ArrayList arrayList14 = arrayList10222;
                        int size14 = arrayList14.size();
                        for (int i50 = 0; i50 < size14; i50++) {
                            f4.s1 s1Var7 = (f4.s1) arrayList14.get(i50);
                            Integer num7 = num5222;
                            if (num7 != null) {
                                i46 = num7.intValue();
                            } else {
                                i46 = 0;
                            }
                            r1Var.k(s1Var7, 0, i43 - i46, t2.u.P);
                        }
                        ArrayList arrayList15 = arrayList6;
                        int size15 = arrayList15.size();
                        for (int i51 = 0; i51 < size15; i51++) {
                            f4.s1 s1Var8 = (f4.s1) arrayList15.get(i51);
                            ca.e eVar4 = eVar3222;
                            if (eVar4 != null) {
                                i44 = eVar4.f4952a;
                            } else {
                                i44 = 0;
                            }
                            Integer num8 = num6222;
                            if (num8 != null) {
                                i45 = num8.intValue();
                            } else {
                                i45 = 0;
                            }
                            r1Var.k(s1Var8, i44, i43 - i45, t2.u.P);
                        }
                        return sn.z.f31622a;
                    }
                });
            default:
                final b3 b3Var2 = (b3) this.f15108d;
                ho.p pVar8 = (ho.p) this.f15109e;
                ho.p pVar9 = (ho.p) this.f15110f;
                ho.p pVar10 = (ho.p) this.f15106b;
                ho.p pVar11 = (ho.p) this.Y;
                j5 j5Var = (j5) this.Z;
                ho.p pVar12 = (ho.p) this.f15111x0;
                final e2 e2Var2 = (e2) obj;
                h5.a aVar2 = (h5.a) obj2;
                float f11 = k5.f27350a;
                final int h11 = h5.a.h(aVar2.f12077a);
                final int g11 = h5.a.g(aVar2.f12077a);
                long a12 = h5.a.a(aVar2.f12077a, 0, 0, 0, 0, 10);
                int c5 = b3Var2.c(e2Var2, e2Var2.getLayoutDirection());
                int d11 = b3Var2.d(e2Var2, e2Var2.getLayoutDirection());
                int b13 = b3Var2.b(e2Var2);
                final s1 V = ((f4.e1) tn.o.w0(e2Var2.a0(l5.f27378a, pVar8))).V(a12);
                int i43 = (-c5) - d11;
                int i44 = -b13;
                final s1 V2 = ((f4.e1) tn.o.w0(e2Var2.a0(l5.f27380c, pVar9))).V(h5.b.i(a12, i43, i44));
                s1 V3 = ((f4.e1) tn.o.w0(e2Var2.a0(l5.f27381d, pVar10))).V(h5.b.i(a12, i43, i44));
                int i45 = V3.f8868a;
                int i46 = this.f15107c;
                if (i45 == 0 && V3.f8869b == 0) {
                    s1Var2 = V3;
                    eVar2 = null;
                } else {
                    int i47 = V3.f8869b;
                    h5.m mVar3 = h5.m.f12093a;
                    if (i46 == 0) {
                        s1Var2 = V3;
                        if (e2Var2.getLayoutDirection() == mVar3) {
                            B3 = e2Var2.B(f11);
                            i19 = B3 + c5;
                        } else {
                            B4 = e2Var2.B(f11);
                            i19 = ((h11 - B4) - i45) - d11;
                        }
                    } else {
                        s1Var2 = V3;
                        if (i46 == 2 || i46 == 3) {
                            if (e2Var2.getLayoutDirection() == mVar3) {
                                B4 = e2Var2.B(f11);
                                i19 = ((h11 - B4) - i45) - d11;
                            } else {
                                B3 = e2Var2.B(f11);
                                i19 = B3 + c5;
                            }
                        } else {
                            i19 = (((h11 - i45) + c5) - d11) / 2;
                        }
                    }
                    eVar2 = new ca.e(i19, i47);
                }
                final s1 V4 = ((f4.e1) tn.o.w0(e2Var2.a0(l5.f27382e, pVar11))).V(a12);
                int i48 = 0;
                if (V4.f8868a == 0 && V4.f8869b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (eVar2 != null) {
                    int i49 = eVar2.f4953b;
                    if (!z10 && i46 != 3) {
                        B5 = V4.f8869b + i49;
                        b12 = e2Var2.B(f11);
                    } else {
                        B5 = e2Var2.B(f11) + i49;
                        b12 = b3Var2.b(e2Var2);
                    }
                    num3 = Integer.valueOf(b12 + B5);
                } else {
                    num3 = null;
                }
                int i50 = V2.f8869b;
                if (i50 != 0) {
                    if (num3 != null) {
                        b11 = num3.intValue();
                    } else {
                        Integer valueOf = Integer.valueOf(V4.f8869b);
                        if (!z10) {
                            num4 = valueOf;
                        } else {
                            num4 = null;
                        }
                        if (num4 != null) {
                            b11 = num4.intValue();
                        } else {
                            b11 = b3Var2.b(e2Var2);
                        }
                    }
                    i48 = b11 + i50;
                }
                final int i51 = i48;
                e1 e1Var4 = new e1(b3Var2, e2Var2);
                if (V.f8868a == 0 && V.f8869b == 0) {
                    S = e1Var4.d();
                } else {
                    S = e2Var2.S(V.f8869b);
                }
                if (z10) {
                    S2 = e1Var4.a();
                } else {
                    S2 = e2Var2.S(V4.f8869b);
                }
                j5Var.f27307a.setValue(new d2(r1.d.m(e1Var4, e2Var2.getLayoutDirection()), S, r1.d.l(e1Var4, e2Var2.getLayoutDirection()), S2));
                final s1 V5 = ((f4.e1) tn.o.w0(e2Var2.a0(l5.f27379b, pVar12))).V(a12);
                final Integer num7 = num3;
                final s1 s1Var7 = s1Var2;
                return e2Var2.Z(h11, g11, tn.u.f33548a, new ho.l() { // from class: q2.h5
                    @Override // ho.l
                    public final Object invoke(Object obj13) {
                        f4.r1 r1Var = (f4.r1) obj13;
                        r1Var.k(f4.s1.this, 0, 0, t2.u.P);
                        r1Var.k(V, 0, 0, t2.u.P);
                        f4.s1 s1Var8 = V2;
                        int i52 = h11 - s1Var8.f8868a;
                        f4.e2 e2Var3 = e2Var2;
                        h5.m layoutDirection = e2Var3.getLayoutDirection();
                        r1.b3 b3Var3 = b3Var2;
                        int c10 = ((b3Var3.c(e2Var3, layoutDirection) + i52) - b3Var3.d(e2Var3, e2Var3.getLayoutDirection())) / 2;
                        int i53 = g11;
                        r1Var.k(s1Var8, c10, i53 - i51, t2.u.P);
                        f4.s1 s1Var9 = V4;
                        r1Var.k(s1Var9, 0, i53 - s1Var9.f8869b, t2.u.P);
                        ca.e eVar4 = eVar2;
                        if (eVar4 != null) {
                            int i54 = eVar4.f4952a;
                            Integer num8 = num7;
                            num8.getClass();
                            r1Var.k(s1Var7, i54, i53 - num8.intValue(), t2.u.P);
                        }
                        return sn.z.f31622a;
                    }
                });
        }
    }

    public /* synthetic */ e(ho.p pVar, c3.j jVar, ho.p pVar2, int i10, b3 b3Var, m2.e1 e1Var, ho.p pVar3, c3.j jVar2) {
        this.f15108d = pVar;
        this.f15109e = jVar;
        this.f15110f = pVar2;
        this.f15107c = i10;
        this.f15106b = b3Var;
        this.Y = e1Var;
        this.Z = pVar3;
        this.f15111x0 = jVar2;
    }

    public /* synthetic */ e(String str, AssistantContract.State state, ho.l lVar, ho.a aVar, j.j jVar, ho.a aVar2, String str2, int i10) {
        this.f15108d = str;
        this.f15110f = state;
        this.f15106b = lVar;
        this.Y = aVar;
        this.f15111x0 = jVar;
        this.Z = aVar2;
        this.f15109e = str2;
        this.f15107c = i10;
    }

    public /* synthetic */ e(b3 b3Var, ho.p pVar, ho.p pVar2, ho.p pVar3, int i10, ho.p pVar4, j5 j5Var, ho.p pVar5) {
        this.f15108d = b3Var;
        this.f15109e = pVar;
        this.f15110f = pVar2;
        this.f15106b = pVar3;
        this.f15107c = i10;
        this.Y = pVar4;
        this.Z = j5Var;
        this.f15111x0 = pVar5;
    }

    public /* synthetic */ e(t1.b bVar, HomePageV3.Section section, HomeStateV3 homeStateV3, ho.l lVar, ho.l lVar2, ho.l lVar3, i3.t tVar, int i10) {
        this.f15108d = bVar;
        this.f15109e = section;
        this.f15110f = homeStateV3;
        this.f15106b = lVar;
        this.Y = lVar2;
        this.Z = lVar3;
        this.f15111x0 = tVar;
        this.f15107c = i10;
    }
}
