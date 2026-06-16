package io.elevenlabs.readerapp.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.domain.model.MetaItem;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.d5;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a7\u0010\n\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\r\u001a\u000f\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/domain/model/MetaItem;", "Lio/elevenlabs/readerapp/ui/components/StatItem;", "toStatItem", "(Lio/elevenlabs/domain/model/MetaItem;)Lio/elevenlabs/readerapp/ui/components/StatItem;", "", FirebaseAnalytics.Param.ITEMS, "Li3/t;", "modifier", "fallbackItems", "Lsn/z;", "ReadMetaStatsRow", "(Ljava/util/List;Li3/t;Ljava/util/List;Lu2/m;II)V", "Preview_ReadMetaStatsRow_all", "(Lu2/m;I)V", "Preview_ReadMetaStatsRow_two", "Preview_ReadMetaStatsRow_one", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadMetaStatsRowKt {
    public static final void Preview_ReadMetaStatsRow_all(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-627678132);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadMetaStatsRow(ig.f.I(new MetaItem("Listens", "24K"), new MetaItem("Length", "2h 30m"), new MetaItem("Rating", "4.5")), p2.e(i3.q.f13017a, 1.0f), null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 23);
        }
    }

    public static final sn.z Preview_ReadMetaStatsRow_all$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadMetaStatsRow_all(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadMetaStatsRow_one(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(639657255);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadMetaStatsRow(ig.f.H(new MetaItem("Listens", "1.2M")), p2.e(i3.q.f13017a, 1.0f), null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 21);
        }
    }

    public static final sn.z Preview_ReadMetaStatsRow_one$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadMetaStatsRow_one(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadMetaStatsRow_two(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1243448321);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadMetaStatsRow(ig.f.I(new MetaItem("Length", "45m"), new MetaItem("Rating", "4.8")), p2.e(i3.q.f13017a, 1.0f), null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 22);
        }
    }

    public static final sn.z Preview_ReadMetaStatsRow_two$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadMetaStatsRow_two(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x004b  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadMetaStatsRow(final List<MetaItem> list, i3.t tVar, List<MetaItem> list2, u2.m mVar, final int i10, final int i11) {
        final List<MetaItem> list3;
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        List<MetaItem> list4;
        int i15;
        boolean z6;
        final i3.t tVar3;
        final List<MetaItem> list5;
        u2.q qVar;
        r1 r10;
        ho.p pVar;
        final i3.t tVar4;
        final List<MetaItem> list6;
        int i16;
        i3.k kVar = i3.d.f13005z0;
        list.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-471194326);
        int i17 = 2;
        if ((i10 & 6) == 0) {
            list3 = list;
            if (qVar2.h(list3)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            list3 = list;
            i12 = i10;
        }
        int i18 = i11 & 2;
        int i19 = 16;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                list4 = list2;
                if (qVar2.h(list4)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                boolean z10 = 0;
                boolean z11 = 1;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i12 & 1, z6)) {
                    i3.q qVar3 = i3.q.f13017a;
                    if (i18 != 0) {
                        tVar4 = qVar3;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        list6 = tn.t.f33547a;
                    } else {
                        list6 = list4;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        StatItem statItem = toStatItem((MetaItem) it.next());
                        if (statItem != null) {
                            arrayList.add(statItem);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = new ArrayList();
                        Iterator<T> it2 = list6.iterator();
                        while (it2.hasNext()) {
                            StatItem statItem2 = toStatItem((MetaItem) it2.next());
                            if (statItem2 != null) {
                                arrayList.add(statItem2);
                            }
                        }
                    }
                    List a12 = tn.o.a1(new Comparator() { // from class: io.elevenlabs.readerapp.ui.components.ReadMetaStatsRowKt$ReadMetaStatsRow$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t10, T t11) {
                            return wn.e.g(Integer.valueOf(((StatItem) t10).getSortOrder()), Integer.valueOf(((StatItem) t11).getSortOrder()));
                        }
                    }, arrayList);
                    if (a12.isEmpty()) {
                        r10 = qVar2.r();
                        if (r10 != null) {
                            final int i20 = 0;
                            pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.h0
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    sn.z ReadMetaStatsRow$lambda$3;
                                    sn.z ReadMetaStatsRow$lambda$5;
                                    switch (i20) {
                                        case 0:
                                            int intValue = ((Integer) obj2).intValue();
                                            ReadMetaStatsRow$lambda$3 = ReadMetaStatsRowKt.ReadMetaStatsRow$lambda$3(list3, tVar4, list6, i10, i11, (u2.m) obj, intValue);
                                            return ReadMetaStatsRow$lambda$3;
                                        default:
                                            int intValue2 = ((Integer) obj2).intValue();
                                            ReadMetaStatsRow$lambda$5 = ReadMetaStatsRowKt.ReadMetaStatsRow$lambda$5(list3, tVar4, list6, i10, i11, (u2.m) obj, intValue2);
                                            return ReadMetaStatsRow$lambda$5;
                                    }
                                }
                            };
                            r10.f34012d = pVar;
                            return;
                        }
                        return;
                    }
                    i3.t tVar5 = tVar4;
                    List<MetaItem> list7 = list6;
                    float x32 = EchoTheme.INSTANCE.getSpacings(qVar2, EchoTheme.$stable).getX3();
                    float f10 = t2.u.P;
                    i3.t G = r1.d.G(tVar5, t2.u.P, x32, 1);
                    k2 a10 = i2.a(r1.j.f29228a, kVar, qVar2, 48);
                    int hashCode = Long.hashCode(qVar2.T);
                    c3.o l4 = qVar2.l();
                    i3.t c5 = i3.a.c(G, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    u2.r.J(h4.g.f11907f, a10, qVar2);
                    u2.r.J(h4.g.f11906e, l4, qVar2);
                    u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                    u2.r.F(h4.g.f11909h, qVar2);
                    Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar2, c5, h4.g.f11905d, 1217767263, a12);
                    int i21 = 0;
                    u2.q qVar4 = qVar2;
                    while (s10.hasNext()) {
                        Object next = s10.next();
                        int i22 = i21 + 1;
                        if (i21 >= 0) {
                            StatItem statItem3 = (StatItem) next;
                            if (i21 > 0) {
                                qVar4.X(742545763);
                                EchoTheme echoTheme = EchoTheme.INSTANCE;
                                int i23 = EchoTheme.$stable;
                                d5.m(p2.f(r1.d.G(qVar3, echoTheme.getSpacings(qVar4, i23).getX4(), f10, i17), 24), (float) z11, echoTheme.getColors(qVar4, i23).getBorder().getSeptenaryAlpha(qVar4, EchoThemeColors.Border.$stable), qVar4, 48);
                                qVar4.p(z10);
                            } else {
                                qVar4.X(742854244);
                                qVar4.p(z10);
                            }
                            if (1.0f <= 0.0d) {
                                s1.a.a("invalid weight; must be greater than zero");
                            }
                            m1 m1Var = new m1(1.0f, z11);
                            k2 a11 = i2.a(r1.j.f29232e, kVar, qVar4, 54);
                            int hashCode2 = Long.hashCode(qVar4.T);
                            c3.o l7 = qVar4.l();
                            i3.t c10 = i3.a.c(m1Var, qVar4);
                            h4.h.f11920i.getClass();
                            h4.f fVar2 = h4.g.f11903b;
                            qVar4.b0();
                            if (qVar4.S) {
                                qVar4.k(fVar2);
                            } else {
                                qVar4.k0();
                            }
                            u2.r.J(h4.g.f11907f, a11, qVar4);
                            u2.r.J(h4.g.f11906e, l7, qVar4);
                            u2.r.y(qVar4, Integer.valueOf(hashCode2), h4.g.f11908g);
                            u2.r.F(h4.g.f11909h, qVar4);
                            u2.r.J(h4.g.f11905d, c10, qVar4);
                            u3.c M = kd.a.M(statItem3.getIcon(), qVar4, z10);
                            EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                            int i24 = EchoTheme.$stable;
                            u2.q qVar5 = qVar4;
                            y2.a(M, null, p2.o(qVar3, i19), echoTheme2.getColors(qVar4, i24).getIcon().getQuaternary(qVar4, EchoThemeColors.Icon.$stable), qVar5, u3.c.$stable | 432, 0);
                            String text = statItem3.getText();
                            s4.y0 a13 = s4.y0.a(echoTheme2.getTypography(qVar5, i24).getBaseRegular500(qVar5, EchoThemeTypography.$stable), 0L, 0L, null, null, null, 0L, 0, 0L, null, new e5.i(e5.f.f8275b, 17, z10), 15728639);
                            boolean z12 = z11;
                            j7.d(text, r1.d.I(qVar3, echoTheme2.getSpacings(qVar5, i24).getX2(), t2.u.P, t2.u.P, t2.u.P, 14), echoTheme2.getColors(qVar5, i24).getText().getPrimary(qVar5, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, a13, qVar5, 0, 24960, 110584);
                            u2.q qVar6 = qVar5;
                            qVar6.p(z12);
                            z11 = z12;
                            i21 = i22;
                            qVar3 = qVar3;
                            i17 = 2;
                            i19 = 16;
                            tVar5 = tVar5;
                            f10 = f10;
                            kVar = kVar;
                            z10 = 0;
                            qVar4 = qVar6;
                        } else {
                            ig.f.U();
                            throw null;
                        }
                    }
                    qVar4.p(z10);
                    qVar4.p(z11);
                    list5 = list7;
                    tVar3 = tVar5;
                    qVar = qVar4;
                } else {
                    qVar2.R();
                    tVar3 = tVar2;
                    list5 = list4;
                    qVar = qVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    final int i25 = 1;
                    pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.h0
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z ReadMetaStatsRow$lambda$3;
                            sn.z ReadMetaStatsRow$lambda$5;
                            switch (i25) {
                                case 0:
                                    int intValue = ((Integer) obj2).intValue();
                                    ReadMetaStatsRow$lambda$3 = ReadMetaStatsRowKt.ReadMetaStatsRow$lambda$3(list, tVar3, list5, i10, i11, (u2.m) obj, intValue);
                                    return ReadMetaStatsRow$lambda$3;
                                default:
                                    int intValue2 = ((Integer) obj2).intValue();
                                    ReadMetaStatsRow$lambda$5 = ReadMetaStatsRowKt.ReadMetaStatsRow$lambda$5(list, tVar3, list5, i10, i11, (u2.m) obj, intValue2);
                                    return ReadMetaStatsRow$lambda$5;
                            }
                        }
                    };
                    r10.f34012d = pVar;
                    return;
                }
                return;
            }
            list4 = list2;
            boolean z102 = 0;
            boolean z112 = 1;
            if ((i12 & 147) != 146) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        list4 = list2;
        boolean z1022 = 0;
        boolean z1122 = 1;
        if ((i12 & 147) != 146) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ReadMetaStatsRow$lambda$3(List list, i3.t tVar, List list2, int i10, int i11, u2.m mVar, int i12) {
        ReadMetaStatsRow(list, tVar, list2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z ReadMetaStatsRow$lambda$5(List list, i3.t tVar, List list2, int i10, int i11, u2.m mVar, int i12) {
        ReadMetaStatsRow(list, tVar, list2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final StatItem toStatItem(MetaItem metaItem) {
        String lowerCase = metaItem.getTitle().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String obj = wq.n.L0(lowerCase).toString();
        MetaStatKeys metaStatKeys = MetaStatKeys.INSTANCE;
        if (metaStatKeys.getLISTENS().contains(obj)) {
            return new StatItem(R.drawable.play_sm, metaItem.getValue(), 0);
        }
        if (metaStatKeys.getDURATION().contains(obj)) {
            return new StatItem(R.drawable.clock_filled, metaItem.getValue(), 1);
        }
        if (metaStatKeys.getRATING().contains(obj)) {
            return new StatItem(R.drawable.star, metaItem.getValue(), 2);
        }
        return null;
    }
}
