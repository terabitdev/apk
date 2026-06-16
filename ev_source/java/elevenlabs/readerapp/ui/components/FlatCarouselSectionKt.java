package io.elevenlabs.readerapp.ui.components;

import a2.h3;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import i4.q2;
import io.elevenlabs.domain.model.FlatCarouselItem;
import io.elevenlabs.domain.model.FlatCarouselSection;
import io.elevenlabs.ui.components.CalloutKt;
import io.elevenlabs.ui.components.CalloutType;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.PageSizeWithRatio;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u000f\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/FlatCarouselSection;", "section", "Li3/t;", "modifier", "Lsn/z;", "FlatCarouselSection", "(Lio/elevenlabs/domain/model/FlatCarouselSection;Li3/t;Lu2/m;II)V", TokenNames.T, "", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "itemContent", "MediaCarousel", "(Ljava/util/List;Li3/t;Lho/q;Lu2/m;II)V", "Lio/elevenlabs/domain/model/FlatCarouselItem;", "item", "Lkotlin/Function0;", "onClick", "FlatCarouselItem", "(Lio/elevenlabs/domain/model/FlatCarouselItem;Lho/a;Li3/t;Lu2/m;II)V", "Preview_FlatCarouselSection", "(Lu2/m;I)V", "Preview_FlatCarouselSection_Single", "Preview_FlatCarouselSection_NoTitle", "Preview_FlatCarouselSection_Empty", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class FlatCarouselSectionKt {
    private static final void FlatCarouselItem(FlatCarouselItem flatCarouselItem, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        i3.t tVar2;
        String str;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1015709358);
        if ((i10 & 6) == 0) {
            if (qVar.h(flatCarouselItem)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (qVar.f(tVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i16 != 0) {
                tVar = i3.q.f13017a;
            }
            i3.t tVar3 = tVar;
            String title = flatCarouselItem.getTitle();
            String subtitle = flatCarouselItem.getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            CalloutType.Large large = new CalloutType.Large(title, subtitle);
            String imageUrl = flatCarouselItem.getImageUrl();
            if (imageUrl == null) {
                str = "";
            } else {
                str = imageUrl;
            }
            int i17 = i12 << 3;
            CalloutKt.Callout(large, str, aVar, tVar3, qVar, CalloutType.Large.$stable | (i17 & 896) | (i17 & 7168), 0);
            tVar2 = tVar3;
        } else {
            qVar.R();
            tVar2 = tVar;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.f(flatCarouselItem, aVar, tVar2, i10, i11, 12);
        }
    }

    public static final sn.z FlatCarouselItem$lambda$0(FlatCarouselItem flatCarouselItem, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        FlatCarouselItem(flatCarouselItem, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0048  */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlatCarouselSection(FlatCarouselSection flatCarouselSection, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        u2.q qVar;
        r1 r10;
        i3.t tVar4;
        i3.t tVar5;
        q2 q2Var;
        h4.e eVar;
        h4.e eVar2;
        EchoTheme echoTheme;
        int i14;
        h4.e eVar3;
        h4.d dVar;
        h4.e eVar4;
        h4.f fVar;
        i3.q qVar2;
        ?? r62;
        u2.q qVar3;
        boolean z10;
        int i15;
        flatCarouselSection.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(-1468474518);
        if ((i10 & 6) == 0) {
            if (qVar4.h(flatCarouselSection)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i10 | i15;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar4.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar4.O(i12 & 1, z6)) {
                i3.q qVar5 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar5;
                } else {
                    tVar4 = tVar2;
                }
                q2 q2Var2 = (q2) qVar4.j(i4.j1.f13138r);
                i3.t e10 = p2.e(tVar4, 1.0f);
                r1.u0 u0Var = r1.j.f29228a;
                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                r1.x a10 = r1.w.a(ib.i.y(echoTheme2, qVar4, i17), i3.d.B0, qVar4, 0);
                int hashCode = Long.hashCode(qVar4.T);
                c3.o l4 = qVar4.l();
                i3.t c5 = i3.a.c(e10, qVar4);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar2);
                } else {
                    qVar4.k0();
                }
                h4.e eVar5 = h4.g.f11907f;
                u2.r.J(eVar5, a10, qVar4);
                h4.e eVar6 = h4.g.f11906e;
                u2.r.J(eVar6, l4, qVar4);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar7 = h4.g.f11908g;
                u2.r.y(qVar4, valueOf, eVar7);
                h4.d dVar2 = h4.g.f11909h;
                u2.r.F(dVar2, qVar4);
                i3.t tVar6 = tVar4;
                h4.e eVar8 = h4.g.f11905d;
                u2.r.J(eVar8, c5, qVar4);
                String title = flatCarouselSection.getTitle();
                if (title == null) {
                    qVar4.X(-2113074521);
                    qVar4.p(false);
                    qVar2 = qVar5;
                    eVar = eVar8;
                    q2Var = q2Var2;
                    eVar2 = eVar5;
                    r62 = 0;
                    echoTheme = echoTheme2;
                    i14 = i17;
                    eVar3 = eVar6;
                    dVar = dVar2;
                    eVar4 = eVar7;
                    fVar = fVar2;
                    tVar5 = tVar6;
                    qVar3 = qVar4;
                } else {
                    qVar4.X(-2113074520);
                    tVar5 = tVar6;
                    q2Var = q2Var2;
                    eVar = eVar8;
                    eVar2 = eVar5;
                    echoTheme = echoTheme2;
                    i14 = i17;
                    eVar3 = eVar6;
                    dVar = dVar2;
                    eVar4 = eVar7;
                    fVar = fVar2;
                    qVar2 = qVar5;
                    j7.d(title, r1.d.G(qVar5, echoTheme2.getSpacings(qVar4, i17).getX5(), t2.u.P, 2), echoTheme2.getColors(qVar4, i17).getText().getPrimary(qVar4, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme2.getTypography(qVar4, i17).getBaseRegular500(qVar4, EchoThemeTypography.$stable), qVar4, 0, 0, 131064);
                    u2.q qVar6 = qVar4;
                    r62 = 0;
                    qVar6.p(false);
                    qVar3 = qVar6;
                }
                int size = flatCarouselSection.getItems().size();
                if (size != 0) {
                    z10 = true;
                    if (size != 1) {
                        qVar3.X(-2112201188);
                        MediaCarousel(flatCarouselSection.getItems(), null, c3.k.d(-1277006949, true, new h3(q2Var, 3), qVar3), qVar3, 384, 2);
                        qVar3.p(r62);
                    } else {
                        q2 q2Var3 = q2Var;
                        qVar3.X(-2112712688);
                        FlatCarouselItem flatCarouselItem = (FlatCarouselItem) tn.o.w0(flatCarouselSection.getItems());
                        i3.t G = r1.d.G(p2.e(qVar2, 1.0f), echoTheme.getSpacings(qVar3, i14).getX5(), t2.u.P, 2);
                        f4.f1 d10 = r1.p.d(i3.d.f13001e, r62);
                        int hashCode2 = Long.hashCode(qVar3.T);
                        c3.o l7 = qVar3.l();
                        i3.t c10 = i3.a.c(G, qVar3);
                        qVar3.b0();
                        if (qVar3.S) {
                            qVar3.k(fVar);
                        } else {
                            qVar3.k0();
                        }
                        u2.r.J(eVar2, d10, qVar3);
                        u2.r.J(eVar3, l7, qVar3);
                        defpackage.f.u(hashCode2, qVar3, eVar4, qVar3, dVar);
                        u2.r.J(eVar, c10, qVar3);
                        boolean h10 = qVar3.h(q2Var3) | qVar3.h(flatCarouselItem);
                        Object L = qVar3.L();
                        if (h10 || L == u2.l.f33918a) {
                            L = new u(q2Var3, flatCarouselItem, r62);
                            qVar3.h0(L);
                        }
                        FlatCarouselItem(flatCarouselItem, (ho.a) L, null, qVar3, 0, 4);
                        qVar3.p(true);
                        qVar3.p(r62);
                    }
                } else {
                    z10 = true;
                    qVar3.X(-2112748896);
                    qVar3.p(r62);
                }
                qVar3.p(z10);
                tVar3 = tVar5;
                qVar = qVar3;
            } else {
                qVar4.R();
                tVar3 = tVar2;
                qVar = qVar4;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.p(flatCarouselSection, tVar3, i10, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 19) == 18) {
        }
        if (!qVar4.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z FlatCarouselSection$lambda$0$1$0$0(q2 q2Var, FlatCarouselItem flatCarouselItem) {
        q2Var.openUri(flatCarouselItem.getDeeplink());
        return sn.z.f31622a;
    }

    public static final sn.z FlatCarouselSection$lambda$0$2(q2 q2Var, FlatCarouselItem flatCarouselItem, u2.m mVar, int i10) {
        flatCarouselItem.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(q2Var) | qVar.h(flatCarouselItem);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new u(q2Var, flatCarouselItem, 1);
            qVar.h0(L);
        }
        FlatCarouselItem(flatCarouselItem, (ho.a) L, null, qVar, i10 & 14, 4);
        return sn.z.f31622a;
    }

    public static final sn.z FlatCarouselSection$lambda$0$2$0$0(q2 q2Var, FlatCarouselItem flatCarouselItem) {
        q2Var.openUri(flatCarouselItem.getDeeplink());
        return sn.z.f31622a;
    }

    public static final sn.z FlatCarouselSection$lambda$1(FlatCarouselSection flatCarouselSection, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        FlatCarouselSection(flatCarouselSection, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> void MediaCarousel(List<? extends T> list, i3.t tVar, ho.q qVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        u2.q qVar2;
        i3.t tVar3;
        r1 r10;
        int i14;
        int i15;
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-1670431624);
        if ((i10 & 6) == 0) {
            if (qVar3.h(list)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar3.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i10 & 384) == 0) {
                if (qVar3.h(qVar)) {
                    i14 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar3.O(i12 & 1, z6)) {
                if (i16 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar2;
                }
                boolean h10 = qVar3.h(list);
                Object L = qVar3.L();
                u2.e eVar = u2.l.f33918a;
                if (h10 || L == eVar) {
                    L = new e(list, 1);
                    qVar3.h0(L);
                }
                w1.c b10 = w1.h0.b(0, (ho.a) L, qVar3, 0, 3);
                float m1979rememberDpToPx8Feqmps = ComposeExtensionsKt.m1979rememberDpToPx8Feqmps(500, qVar3, 6);
                boolean c5 = qVar3.c(m1979rememberDpToPx8Feqmps);
                Object L2 = qVar3.L();
                if (c5 || L2 == eVar) {
                    L2 = new PageSizeWithRatio(0.9f, Integer.valueOf((int) m1979rememberDpToPx8Feqmps));
                    qVar3.h0(L2);
                }
                PageSizeWithRatio pageSizeWithRatio = (PageSizeWithRatio) L2;
                i3.t e10 = p2.e(tVar3, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                qVar2 = qVar3;
                gg.b.d(b10, e10, r1.d.d(echoTheme.getSpacings(qVar3, i17).getX5(), t2.u.P, 2), pageSizeWithRatio, list.size(), echoTheme.getSpacings(qVar3, i17).getX2(), i3.d.f13004y0, null, false, null, null, null, c3.k.d(1928466071, true, new f(list, qVar, 1), qVar3), qVar2, 1572864, 24576, 16256);
            } else {
                qVar2 = qVar3;
                qVar2.R();
                tVar3 = tVar2;
            }
            r10 = qVar2.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(list, tVar3, qVar, i10, i11, 11, false);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i10 & 384) == 0) {
        }
        if ((i12 & 147) == 146) {
        }
        if (!qVar3.O(i12 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 == null) {
        }
    }

    public static final sn.z MediaCarousel$lambda$2(List list, ho.q qVar, w1.w wVar, int i10, u2.m mVar, int i11) {
        wVar.getClass();
        qVar.invoke(list.get(i10), mVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z MediaCarousel$lambda$3(List list, i3.t tVar, ho.q qVar, int i10, int i11, u2.m mVar, int i12) {
        MediaCarousel(list, tVar, qVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_FlatCarouselSection(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-859633078);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            FlatCarouselSection(new FlatCarouselSection("Featured Stories", ig.f.I(new FlatCarouselItem("elevenlabs://read/1", "The Great Adventure", "By Author One", "https://example.com/image1.jpg"), new FlatCarouselItem("elevenlabs://read/2", "Mystery of the Lost Key", "By Author Two", "https://example.com/image2.jpg"), new FlatCarouselItem("elevenlabs://read/3", "Science Fiction Chronicles", "By Author Three", "https://example.com/image3.jpg"))), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 5);
        }
    }

    public static final sn.z Preview_FlatCarouselSection$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_FlatCarouselSection(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_FlatCarouselSection_Empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1938480072);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            FlatCarouselSection(new FlatCarouselSection("No Items Available", tn.t.f33547a), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 4);
        }
    }

    public static final sn.z Preview_FlatCarouselSection_Empty$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_FlatCarouselSection_Empty(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_FlatCarouselSection_NoTitle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(462402306);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            FlatCarouselSection(new FlatCarouselSection(null, ig.f.H(new FlatCarouselItem("elevenlabs://read/1", "The Art of Reading", "Discover new worlds through literature", null))), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 7);
        }
    }

    public static final sn.z Preview_FlatCarouselSection_NoTitle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_FlatCarouselSection_NoTitle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_FlatCarouselSection_Single(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(688325667);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            FlatCarouselSection(new FlatCarouselSection("Recommended Read", ig.f.H(new FlatCarouselItem("elevenlabs://read/1", "The Art of Reading", "Discover new worlds through literature", "https://example.com/image1.jpg"))), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 6);
        }
    }

    public static final sn.z Preview_FlatCarouselSection_Single$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_FlatCarouselSection_Single(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
