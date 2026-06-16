package io.elevenlabs.readerapp.ui.screens.authenticated.voices.elements;

import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import gg.b;
import h4.f;
import h4.f2;
import h4.g;
import h4.h;
import ho.l;
import ho.p;
import i3.a;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceSection;
import io.elevenlabs.readerapp.ui.components.VoiceRowKt;
import io.elevenlabs.readerapp.ui.previews.VoiceSectionsFactoryKt;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.PageSizeWithRatio;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.e;
import r1.j;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import w1.c;
import w1.h0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aO\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/model/VoiceSection$VoiceGridSection;", "item", "", "playingPreviewVoiceId", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/Voice;", "Lsn/z;", "onVoiceClick", "onVoicePreviewToggle", "VoicesGridUI", "(Lio/elevenlabs/domain/model/VoiceSection$VoiceGridSection;Ljava/lang/String;Lho/l;Lho/l;Lu2/m;II)V", "Preview_VoicesGridUI", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicesGridUIKt {
    public static final void Preview_VoicesGridUI(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1884628516);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t y10 = n.y(p2.e(i3.q.f13017a, 1.0f), n.x(qVar), true, true);
            x a10 = w.a(j.f29230c, d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(y10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            VoicesGridUI(VoiceSectionsFactoryKt.stubVoiceGridSection(), null, null, null, qVar, 0, 14);
            VoicesGridUI(VoiceSection.VoiceGridSection.copy$default(VoiceSectionsFactoryKt.stubVoiceGridSection(), null, null, tn.o.b1(VoicesFactoryKt.stubVoicesList(), 2), 3, null), null, null, null, qVar, 0, 14);
            VoicesGridUI(VoiceSection.VoiceGridSection.copy$default(VoiceSectionsFactoryKt.stubVoiceGridSection(), "Very long title that will definitely take some space, a line or two but honestly who need that long title", null, null, 6, null), null, null, null, qVar, 0, 14);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 29);
        }
    }

    public static final z Preview_VoicesGridUI$lambda$1(int i10, m mVar, int i11) {
        Preview_VoicesGridUI(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoicesGridUI(VoiceSection.VoiceGridSection voiceGridSection, String str, l lVar, l lVar2, m mVar, int i10, int i11) {
        int i12;
        Object obj;
        int i13;
        int i14;
        Object obj2;
        int i15;
        int i16;
        Object obj3;
        int i17;
        boolean z6;
        q qVar;
        Object obj4;
        Object obj5;
        Object obj6;
        r1 r10;
        Object obj7;
        Object obj8;
        Object obj9;
        int i18;
        voiceGridSection.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-450215431);
        if ((i10 & 6) == 0) {
            if (qVar2.h(voiceGridSection)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            obj = str;
            if (qVar2.f(obj)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                obj2 = lVar;
                if (qVar2.h(obj2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    obj3 = lVar2;
                    if (qVar2.h(obj3)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    if ((i12 & 1171) == 1170) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i12 & 1, z6)) {
                        if (i19 != 0) {
                            obj7 = null;
                        } else {
                            obj7 = obj;
                        }
                        Object obj10 = u2.l.f33918a;
                        if (i14 != 0) {
                            Object L = qVar2.L();
                            if (L == obj10) {
                                L = new oa.n(7);
                                qVar2.h0(L);
                            }
                            obj8 = (l) L;
                        } else {
                            obj8 = obj2;
                        }
                        if (i16 != 0) {
                            Object L2 = qVar2.L();
                            if (L2 == obj10) {
                                L2 = new oa.n(8);
                                qVar2.h0(L2);
                            }
                            obj9 = (l) L2;
                        } else {
                            obj9 = obj3;
                        }
                        e eVar = j.f29230c;
                        i3.j jVar = d.B0;
                        x a10 = w.a(eVar, jVar, qVar2, 0);
                        int hashCode = Long.hashCode(qVar2.T);
                        o l4 = qVar2.l();
                        i3.q qVar3 = i3.q.f13017a;
                        t c5 = a.c(qVar3, qVar2);
                        h.f11920i.getClass();
                        ho.a aVar = g.f11903b;
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(aVar);
                        } else {
                            qVar2.k0();
                        }
                        h4.e eVar2 = g.f11907f;
                        r.J(eVar2, a10, qVar2);
                        h4.e eVar3 = g.f11906e;
                        r.J(eVar3, l4, qVar2);
                        Integer valueOf = Integer.valueOf(hashCode);
                        h4.e eVar4 = g.f11908g;
                        r.y(qVar2, valueOf, eVar4);
                        h4.d dVar = g.f11909h;
                        r.F(dVar, qVar2);
                        h4.e eVar5 = g.f11905d;
                        r.J(eVar5, c5, qVar2);
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        int i20 = ElevenLabsTheme.$stable;
                        Object obj11 = obj7;
                        t E = r1.d.E(qVar3, elevenLabsTheme.getSpacings(qVar2, i20).m2358getX6D9Ej5fM());
                        Object obj12 = obj8;
                        x a11 = w.a(eVar, jVar, qVar2, 0);
                        int hashCode2 = Long.hashCode(qVar2.T);
                        o l7 = qVar2.l();
                        t c10 = a.c(E, qVar2);
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(aVar);
                        } else {
                            qVar2.k0();
                        }
                        r.J(eVar2, a11, qVar2);
                        r.J(eVar3, l7, qVar2);
                        defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
                        r.J(eVar5, c10, qVar2);
                        String upperCase = voiceGridSection.getSubtitle().toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        j7.d(upperCase, null, i.w(elevenLabsTheme, qVar2, i20), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i20).getSubtitleSmall700(), qVar2, 0, 0, 131066);
                        r1.d.g(p2.f(qVar3, elevenLabsTheme.getSpacings(qVar2, i20).m2350getX1D9Ej5fM()), qVar2);
                        j7.d(voiceGridSection.getTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i20).getTitleLarge700Inter(), qVar2, 0, 0, 131070);
                        qVar2.p(true);
                        boolean f10 = qVar2.f(voiceGridSection.getVoices());
                        Object L3 = qVar2.L();
                        if (f10 || L3 == obj10) {
                            L3 = tn.o.m1(voiceGridSection.getVoices(), 3, 3, true);
                            qVar2.h0(L3);
                        }
                        List list = (List) L3;
                        float m1979rememberDpToPx8Feqmps = ComposeExtensionsKt.m1979rememberDpToPx8Feqmps(500, qVar2, 6);
                        boolean c11 = qVar2.c(m1979rememberDpToPx8Feqmps);
                        Object L4 = qVar2.L();
                        if (c11 || L4 == obj10) {
                            L4 = new PageSizeWithRatio(0.9f, Integer.valueOf((int) m1979rememberDpToPx8Feqmps));
                            qVar2.h0(L4);
                        }
                        w1.j jVar2 = (PageSizeWithRatio) L4;
                        boolean h10 = qVar2.h(list);
                        Object L5 = qVar2.L();
                        if (h10 || L5 == obj10) {
                            L5 = new io.elevenlabs.readerapp.ui.components.e(list, 5);
                            qVar2.h0(L5);
                        }
                        c b10 = h0.b(0, (ho.a) L5, qVar2, 0, 3);
                        if (list.size() <= 1) {
                            jVar2 = w1.h.f35997a;
                        }
                        Object obj13 = obj9;
                        b.d(b10, null, null, jVar2, 0, u.P, d.f13004y0, null, false, null, null, null, k.d(294116784, true, new io.elevenlabs.readerapp.core.router.g(list, obj11, obj12, obj13, 7), qVar2), qVar2, 1572864, 24576, 16310);
                        qVar = qVar2;
                        r1.d.g(r1.d.E(qVar3, elevenLabsTheme.getSpacings(qVar, i20).m2355getX3D9Ej5fM()), qVar);
                        qVar.p(true);
                        obj4 = obj11;
                        obj5 = obj12;
                        obj6 = obj13;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        obj4 = obj;
                        obj5 = obj2;
                        obj6 = obj3;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f(voiceGridSection, obj4, obj5, obj6, i10, i11, 12, false);
                        return;
                    }
                    return;
                }
                obj3 = lVar2;
                if ((i12 & 1171) == 1170) {
                }
                if (!qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            obj2 = lVar;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            obj3 = lVar2;
            if ((i12 & 1171) == 1170) {
            }
            if (!qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        obj = str;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        obj2 = lVar;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        obj3 = lVar2;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z VoicesGridUI$lambda$0$0(Voice voice) {
        voice.getClass();
        return z.f31622a;
    }

    public static final z VoicesGridUI$lambda$1$0(Voice voice) {
        voice.getClass();
        return z.f31622a;
    }

    public static final z VoicesGridUI$lambda$2$4(List list, String str, l lVar, l lVar2, w1.w wVar, int i10, m mVar, int i11) {
        q qVar;
        boolean z6;
        l lVar3 = lVar;
        l lVar4 = lVar2;
        wVar.getClass();
        boolean z10 = false;
        x a10 = w.a(j.f29230c, d.B0, mVar, 0);
        q qVar2 = (q) mVar;
        int hashCode = Long.hashCode(qVar2.T);
        o l4 = qVar2.l();
        i3.q qVar3 = i3.q.f13017a;
        t c5 = a.c(qVar3, mVar);
        h.f11920i.getClass();
        f fVar = g.f11903b;
        f2 f2Var = qVar2.f33969a;
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar);
        } else {
            qVar2.k0();
        }
        r.J(g.f11907f, a10, mVar);
        r.J(g.f11906e, l4, mVar);
        r.y(mVar, Integer.valueOf(hashCode), g.f11908g);
        r.F(g.f11909h, mVar);
        r.J(g.f11905d, c5, mVar);
        List list2 = (List) list.get(i10);
        qVar2.X(-703295796);
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 >= 0) {
                Voice voice = (Voice) obj;
                int i14 = i12;
                String voiceId = voice.getVoiceId();
                boolean c10 = kotlin.jvm.internal.m.c(voice.getVoiceId(), str);
                String name = voice.getName();
                String subtitle = voice.getSubtitle();
                String useCase = voice.getUseCase();
                String imageUrl = voice.getImageUrl();
                boolean f10 = qVar2.f(lVar3) | qVar2.h(voice);
                Object L = qVar2.L();
                u2.e eVar = u2.l.f33918a;
                if (f10 || L == eVar) {
                    L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.b(lVar3, voice, 5);
                    qVar2.h0(L);
                }
                ho.a aVar = (ho.a) L;
                p m1752getLambda$1205196802$app_productionRelease = ComposableSingletons$VoicesGridUIKt.INSTANCE.m1752getLambda$1205196802$app_productionRelease();
                boolean f11 = qVar2.f(lVar4) | qVar2.h(voice);
                Object L2 = qVar2.L();
                if (f11 || L2 == eVar) {
                    L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.b(lVar4, voice, 6);
                    qVar2.h0(L2);
                }
                i3.q qVar4 = qVar3;
                q qVar5 = qVar2;
                VoiceRowKt.m1108VoiceRowLYuG0Iw(voiceId, aVar, name, subtitle, useCase, imageUrl, false, false, m1752getLambda$1205196802$app_productionRelease, false, c10, (ho.a) L2, u.P, null, mVar, 114819072, 0, 12800);
                if (i14 != list2.size() - 1) {
                    qVar = qVar5;
                    qVar.X(1296735222);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i15 = ElevenLabsTheme.$stable;
                    DividerKt.m1827DivideriJQMabo(r1.d.G(qVar4, elevenLabsTheme.getSpacings(mVar, i15).m2357getX5D9Ej5fM(), u.P, 2), elevenLabsTheme.getColor(mVar, i15).getDivider().m2058getLightLine0d7_KjU(), mVar, 0, 0);
                    z6 = false;
                    qVar.p(false);
                } else {
                    qVar = qVar5;
                    z6 = false;
                    qVar.X(1296957895);
                    qVar.p(false);
                }
                lVar4 = lVar2;
                qVar2 = qVar;
                z10 = z6;
                i12 = i13;
                qVar3 = qVar4;
                lVar3 = lVar;
            } else {
                ig.f.U();
                throw null;
            }
        }
        q qVar6 = qVar2;
        qVar6.p(z10);
        qVar6.p(true);
        return z.f31622a;
    }

    public static final z VoicesGridUI$lambda$2$4$0$0$0$0(l lVar, Voice voice) {
        lVar.invoke(voice);
        return z.f31622a;
    }

    public static final z VoicesGridUI$lambda$2$4$0$0$1$0(l lVar, Voice voice) {
        lVar.invoke(voice);
        return z.f31622a;
    }

    public static final z VoicesGridUI$lambda$3(VoiceSection.VoiceGridSection voiceGridSection, String str, l lVar, l lVar2, int i10, int i11, m mVar, int i12) {
        VoicesGridUI(voiceGridSection, str, lVar, lVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
