package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements;

import a2.d0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import ho.l;
import ho.p;
import i3.k;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.ListeningProgress;
import io.elevenlabs.domain.model.ListeningProgressKt;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.ReadMetaCoverKt;
import io.elevenlabs.readerapp.ui.components.ReadRowKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.MenuKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.PageSizeWithRatio;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.d2;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.s;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import tn.o;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;
import w1.h0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001ai\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"", "title", "", "Lio/elevenlabs/domain/model/ReadMeta;", "reads", "Li3/t;", "modifier", "Lio/elevenlabs/domain/model/MediaItemState;", "playerQueue", "Lkotlin/Function1;", "Lsn/z;", "onReadClick", "onReadLongClick", "HomeReadsCarouselV3", "(Ljava/lang/String;Ljava/util/List;Li3/t;Ljava/util/List;Lho/l;Lho/l;Lu2/m;II)V", "Preview_HomeReadsCarouselV3", "(Lu2/m;I)V", "", "menuExpanded", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeReadsCarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeReadsCarouselV3(String str, List<ReadMeta> list, t tVar, List<MediaItemState> list2, l lVar, l lVar2, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        l lVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z6;
        q qVar;
        l lVar4;
        r1 r10;
        l lVar5;
        l lVar6;
        Object obj;
        t tVar3;
        int i19;
        int i20;
        int i21;
        str.getClass();
        list.getClass();
        list2.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-960637117);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(list)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        int i22 = i11 & 4;
        if (i22 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i10 & 3072) == 0) {
                if (qVar2.h(list2)) {
                    i19 = 2048;
                } else {
                    i19 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i19;
            }
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                lVar3 = lVar;
                if (qVar2.h(lVar3)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 32;
                if (i16 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    if (qVar2.h(lVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                    i18 = i12;
                    if ((74899 & i18) == 74898) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i18 & 1, z6)) {
                        i3.q qVar3 = i3.q.f13017a;
                        if (i22 != 0) {
                            tVar2 = qVar3;
                        }
                        Object obj2 = u2.l.f33918a;
                        if (i14 != 0) {
                            Object L = qVar2.L();
                            if (L == obj2) {
                                L = new a(1);
                                qVar2.h0(L);
                            }
                            lVar5 = (l) L;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i16 != 0) {
                            Object L2 = qVar2.L();
                            if (L2 == obj2) {
                                L2 = new a(2);
                                qVar2.h0(L2);
                            }
                            lVar6 = (l) L2;
                        } else {
                            lVar6 = lVar2;
                        }
                        boolean h10 = qVar2.h(list);
                        Object L3 = qVar2.L();
                        if (h10 || L3 == obj2) {
                            L3 = new io.elevenlabs.readerapp.ui.components.e(list, 3);
                            qVar2.h0(L3);
                        }
                        w1.c b10 = h0.b(0, (ho.a) L3, qVar2, 0, 3);
                        boolean f10 = qVar2.f(list);
                        Object L4 = qVar2.L();
                        if (!f10 && L4 != obj2) {
                            obj = obj2;
                            tVar3 = tVar2;
                        } else {
                            obj = obj2;
                            tVar3 = tVar2;
                            L4 = o.E0(list, null, null, null, new a(3), 31);
                            qVar2.h0(L4);
                        }
                        String str2 = (String) L4;
                        boolean f11 = qVar2.f(b10);
                        Object L5 = qVar2.L();
                        if (f11 || L5 == obj) {
                            L5 = new HomeReadsCarouselKt$HomeReadsCarouselV3$3$1(b10, null);
                            qVar2.h0(L5);
                        }
                        r.f((p) L5, str2, qVar2);
                        float m1979rememberDpToPx8Feqmps = ComposeExtensionsKt.m1979rememberDpToPx8Feqmps(500, qVar2, 6);
                        boolean c5 = qVar2.c(m1979rememberDpToPx8Feqmps);
                        Object L6 = qVar2.L();
                        if (c5 || L6 == obj) {
                            L6 = new PageSizeWithRatio(0.9f, Integer.valueOf((int) m1979rememberDpToPx8Feqmps));
                            qVar2.h0(L6);
                        }
                        PageSizeWithRatio pageSizeWithRatio = (PageSizeWithRatio) L6;
                        x a10 = w.a(j.f29230c, i3.d.B0, qVar2, 0);
                        int hashCode = Long.hashCode(qVar2.T);
                        c3.o l4 = qVar2.l();
                        t c10 = i3.a.c(tVar3, qVar2);
                        h4.h.f11920i.getClass();
                        ho.a aVar = h4.g.f11903b;
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(aVar);
                        } else {
                            qVar2.k0();
                        }
                        h4.e eVar = h4.g.f11907f;
                        r.J(eVar, a10, qVar2);
                        h4.e eVar2 = h4.g.f11906e;
                        r.J(eVar2, l4, qVar2);
                        Integer valueOf = Integer.valueOf(hashCode);
                        h4.e eVar3 = h4.g.f11908g;
                        r.y(qVar2, valueOf, eVar3);
                        h4.d dVar = h4.g.f11909h;
                        r.F(dVar, qVar2);
                        h4.e eVar4 = h4.g.f11905d;
                        r.J(eVar4, c10, qVar2);
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        t tVar4 = tVar3;
                        int i23 = ElevenLabsTheme.$stable;
                        t F = r1.d.F(qVar3, elevenLabsTheme.getSpacings(qVar2, i23).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar2, i23).m2355getX3D9Ej5fM());
                        f1 d10 = r1.p.d(i3.d.f12997a, false);
                        int hashCode2 = Long.hashCode(qVar2.T);
                        c3.o l7 = qVar2.l();
                        t c11 = i3.a.c(F, qVar2);
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(aVar);
                        } else {
                            qVar2.k0();
                        }
                        r.J(eVar, d10, qVar2);
                        r.J(eVar2, l7, qVar2);
                        defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
                        r.J(eVar4, c11, qVar2);
                        j7.d(str, p2.e(qVar3, 1.0f), defpackage.f.A(elevenLabsTheme, qVar2, i23), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i23).getBodyMedium500(), qVar2, (i18 & 14) | 48, 0, 131064);
                        qVar2.p(true);
                        t e10 = p2.e(qVar3, 1.0f);
                        k kVar = i3.d.f13004y0;
                        float m2356getX4D9Ej5fM = elevenLabsTheme.getSpacings(qVar2, i23).m2356getX4D9Ej5fM();
                        d2 d11 = r1.d.d(elevenLabsTheme.getSpacings(qVar2, i23).m2357getX5D9Ej5fM(), u.P, 2);
                        l lVar7 = lVar5;
                        l lVar8 = lVar6;
                        gg.b.d(b10, e10, d11, pageSizeWithRatio, 0, m2356getX4D9Ej5fM, kVar, null, false, null, null, null, c3.k.d(1163687596, true, new io.elevenlabs.readerapp.core.router.g(list, list2, lVar7, lVar8, 5), qVar2), qVar2, 1572912, 24576, 16272);
                        qVar = qVar2;
                        qVar.p(true);
                        lVar3 = lVar7;
                        tVar2 = tVar4;
                        lVar4 = lVar8;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        lVar4 = lVar2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new f(str, list, tVar2, list2, lVar3, lVar4, i10, i11);
                        return;
                    }
                    return;
                }
                i18 = i12;
                if ((74899 & i18) == 74898) {
                }
                if (!qVar2.O(i18 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar3 = lVar;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            i18 = i12;
            if ((74899 & i18) == 74898) {
            }
            if (!qVar2.O(i18 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        if ((i10 & 3072) == 0) {
        }
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        lVar3 = lVar;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        i18 = i12;
        if ((74899 & i18) == 74898) {
        }
        if (!qVar2.O(i18 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HomeReadsCarouselV3$lambda$0$0(ReadMeta readMeta) {
        readMeta.getClass();
        return z.f31622a;
    }

    public static final z HomeReadsCarouselV3$lambda$1$0(ReadMeta readMeta) {
        readMeta.getClass();
        return z.f31622a;
    }

    public static final CharSequence HomeReadsCarouselV3$lambda$3$0(ReadMeta readMeta) {
        readMeta.getClass();
        return readMeta.getReadId();
    }

    public static final z HomeReadsCarouselV3$lambda$6$1(List list, List list2, l lVar, l lVar2, w1.w wVar, int i10, m mVar, int i11) {
        wVar.getClass();
        ReadMeta readMeta = (ReadMeta) list.get(i10);
        q qVar = (q) mVar;
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (L == eVar) {
            L = r.A(Boolean.FALSE);
            qVar.h0(L);
        }
        z0 z0Var = (z0) L;
        boolean f10 = qVar.f(readMeta) | qVar.f(list2);
        Object L2 = qVar.L();
        if (f10 || L2 == eVar) {
            boolean z6 = false;
            if (list2 == null || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (kotlin.jvm.internal.m.c(((MediaItemState) it.next()).getReadId(), readMeta.getReadId())) {
                        z6 = true;
                        break;
                    }
                }
            }
            L2 = Boolean.valueOf(z6);
            qVar.h0(L2);
        }
        boolean booleanValue = ((Boolean) L2).booleanValue();
        String title = readMeta.getTitle();
        boolean f11 = qVar.f(lVar) | qVar.h(readMeta);
        Object L3 = qVar.L();
        if (f11 || L3 == eVar) {
            L3 = new a2.q(lVar, readMeta, 26);
            qVar.h0(L3);
        }
        ho.a aVar = (ho.a) L3;
        Object L4 = qVar.L();
        if (L4 == eVar) {
            L4 = new d0(z0Var, 16);
            qVar.h0(L4);
        }
        ButtonContainerKt.m1780ButtonContainer83mGB3Q(title, aVar, null, 0L, false, 0, null, false, (ho.a) L4, c3.k.d(-573525688, true, new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.u(readMeta, booleanValue, lVar2, z0Var), qVar), qVar, 905969664, 252);
        return z.f31622a;
    }

    private static final boolean HomeReadsCarouselV3$lambda$6$1$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void HomeReadsCarouselV3$lambda$6$1$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z HomeReadsCarouselV3$lambda$6$1$4$0(l lVar, ReadMeta readMeta) {
        lVar.invoke(readMeta);
        return z.f31622a;
    }

    public static final z HomeReadsCarouselV3$lambda$6$1$5$0(z0 z0Var) {
        HomeReadsCarouselV3$lambda$6$1$2(z0Var, true);
        return z.f31622a;
    }

    public static final z HomeReadsCarouselV3$lambda$6$1$6(final ReadMeta readMeta, final z0 z0Var, final l lVar, final boolean z6, s sVar, m mVar, int i10) {
        boolean z10;
        boolean z11;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            t G = r1.d.G(e10, u.P, elevenLabsTheme.getSpacings(qVar, i11).m2355getX3D9Ej5fM(), 1);
            k2 a10 = i2.a(j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar);
            t h10 = n.h(m3.h.c(p2.o(qVar2, 88), elevenLabsTheme.getShapes(qVar, i11).getMd()), elevenLabsTheme.getColor(qVar, i11).getBackground().m2006getTertiary0d7_KjU(), p3.h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            t c10 = i3.a.c(h10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, d10, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            ReadMetaCoverKt.ReadMetaCover(readMeta, null, null, qVar, 0, 6);
            qVar.p(true);
            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2355getX3D9Ej5fM()), qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            x a11 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            t c11 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a11, qVar);
            r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c11, qVar);
            j7.d(readMeta.getTitle(), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyMedium700(), qVar, 0, 24960, 110590);
            q qVar3 = qVar;
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar3, i11).m2350getX1D9Ej5fM()), qVar3);
            String description = readMeta.getDescription();
            if (description != null && !wq.n.m0(description)) {
                qVar3.X(1782360648);
                j7.d(description, null, i.w(elevenLabsTheme, qVar3, i11), 0L, null, 0L, null, 0L, 2, false, 2, 0, null, elevenLabsTheme.getTypo(qVar3, i11).getBodySmall500(), qVar3, 0, 24960, 110586);
                qVar3 = qVar3;
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar3, i11).m2350getX1D9Ej5fM()), qVar3);
                qVar3.p(false);
            } else {
                qVar3.X(1782833460);
                qVar3.p(false);
            }
            boolean f10 = qVar3.f(readMeta.getReadId()) | qVar3.e(readMeta.getLastListenedCharOffset()) | qVar3.f(readMeta.getLastListenedAudioSeconds());
            Object L = qVar3.L();
            u2.e eVar5 = u2.l.f33918a;
            if (f10 || L == eVar5) {
                L = ListeningProgressKt.getListeningProgress(readMeta);
                qVar3.h0(L);
            }
            ListeningProgress listeningProgress = (ListeningProgress) L;
            if (readMeta.getCompletedAt() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            ReadRowKt.ReadStatusRow(listeningProgress, tn.t.f33547a, z11, ReadMetaKt.isAvailableOffline(readMeta), qVar3, 48);
            qVar3.p(true);
            qVar3.p(true);
            boolean HomeReadsCarouselV3$lambda$6$1$1 = HomeReadsCarouselV3$lambda$6$1$1(z0Var);
            Object L2 = qVar3.L();
            if (L2 == eVar5) {
                L2 = new d0(z0Var, 15);
                qVar3.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            float f11 = 0;
            MenuKt.m1842MenuILWXrKs(HomeReadsCarouselV3$lambda$6$1$1, aVar, null, (Float.floatToRawIntBits(f11) << 32) | (4294967295L & Float.floatToRawIntBits(f11)), null, ig.f.H(c3.k.d(570658456, true, new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.e
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z HomeReadsCarouselV3$lambda$6$1$6$2;
                    int intValue = ((Integer) obj2).intValue();
                    HomeReadsCarouselV3$lambda$6$1$6$2 = HomeReadsCarouselKt.HomeReadsCarouselV3$lambda$6$1$6$2(lVar, readMeta, z6, z0Var, (m) obj, intValue);
                    return HomeReadsCarouselV3$lambda$6$1$6$2;
                }
            }, qVar3)), qVar3, 199728, 20);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeReadsCarouselV3$lambda$6$1$6$1$0(z0 z0Var) {
        HomeReadsCarouselV3$lambda$6$1$2(z0Var, false);
        return z.f31622a;
    }

    public static final z HomeReadsCarouselV3$lambda$6$1$6$2(l lVar, ReadMeta readMeta, boolean z6, z0 z0Var, m mVar, int i10) {
        boolean z10;
        int i11;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            boolean f10 = qVar.f(lVar) | qVar.h(readMeta);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new c3.b(lVar, readMeta, z0Var, 16);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            if (z6) {
                i11 = R.string.menu_item_player_remove_from_queue;
            } else {
                i11 = R.string.menu_item_player_add_to_queue;
            }
            MenuKt.MenuItem(aVar, false, kj.c.R(qVar, i11), Integer.valueOf(io.elevenlabs.ui.R.drawable.playlist_add), false, false, qVar, 0, 50);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeReadsCarouselV3$lambda$6$1$6$2$0$0(l lVar, ReadMeta readMeta, z0 z0Var) {
        HomeReadsCarouselV3$lambda$6$1$2(z0Var, false);
        lVar.invoke(readMeta);
        return z.f31622a;
    }

    public static final z HomeReadsCarouselV3$lambda$7(String str, List list, t tVar, List list2, l lVar, l lVar2, int i10, int i11, m mVar, int i12) {
        HomeReadsCarouselV3(str, list, tVar, list2, lVar, lVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_HomeReadsCarouselV3(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1259362224);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            List stubReadMetaList$default = ReadsFactoryKt.stubReadMetaList$default(5, null, 2, null);
            tn.t tVar = tn.t.f33547a;
            HomeReadsCarouselV3("Jump back into your recents", stubReadMetaList$default, null, tVar, null, null, qVar, 3078, 52);
            HomeReadsCarouselV3("Jump back into your recents", ReadsFactoryKt.stubReadMetaList$default(1, null, 2, null), null, tVar, null, null, qVar, 3078, 52);
            HomeReadsCarouselV3("Very long title that will definitely take some space, a line or two but honestly who need that long title", ReadsFactoryKt.stubReadMetaList$default(0, null, 3, null), null, tVar, null, null, qVar, 3078, 52);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 2);
        }
    }

    public static final z Preview_HomeReadsCarouselV3$lambda$1(int i10, m mVar, int i11) {
        Preview_HomeReadsCarouselV3(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
