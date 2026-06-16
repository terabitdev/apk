package io.elevenlabs.readerapp.ui.screens.authenticated.voices.elements;

import c3.o;
import e5.k;
import h4.f;
import h4.g;
import h4.h;
import ho.l;
import i3.a;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceSection;
import io.elevenlabs.readerapp.ui.previews.VoiceSectionsFactoryKt;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.ui.components.VoiceAvatarKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.j;
import r1.p2;
import r1.s;
import r1.w;
import r1.x;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/model/VoiceSection$VoiceCarouselSection;", "item", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/Voice;", "Lsn/z;", "onVoiceClick", "VoicesCarouselUI", "(Lio/elevenlabs/domain/model/VoiceSection$VoiceCarouselSection;Lho/l;Lu2/m;II)V", "Preview_VoicesCarouselUI", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicesCarouselUIKt {
    public static final void Preview_VoicesCarouselUI(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(18041884);
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
            VoicesCarouselUI(VoiceSectionsFactoryKt.stubVoiceCarouselSection(), null, qVar, 0, 2);
            VoicesCarouselUI(VoiceSection.VoiceCarouselSection.copy$default(VoiceSectionsFactoryKt.stubVoiceCarouselSection(), null, null, tn.o.b1(VoicesFactoryKt.stubVoicesList(), 2), 3, null), null, qVar, 0, 2);
            VoicesCarouselUI(VoiceSection.VoiceCarouselSection.copy$default(VoiceSectionsFactoryKt.stubVoiceCarouselSection(), "Very long title that will definitely take some space, a line or two but honestly who need that long title", null, null, 6, null), null, qVar, 0, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 28);
        }
    }

    public static final z Preview_VoicesCarouselUI$lambda$1(int i10, m mVar, int i11) {
        Preview_VoicesCarouselUI(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void VoicesCarouselUI(io.elevenlabs.domain.model.VoiceSection.VoiceCarouselSection r51, ho.l r52, u2.m r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.voices.elements.VoicesCarouselUIKt.VoicesCarouselUI(io.elevenlabs.domain.model.VoiceSection$VoiceCarouselSection, ho.l, u2.m, int, int):void");
    }

    public static final z VoicesCarouselUI$lambda$0$0(Voice voice) {
        voice.getClass();
        return z.f31622a;
    }

    public static final z VoicesCarouselUI$lambda$1$0$1$0$0$0(l lVar, Voice voice) {
        lVar.invoke(voice);
        return z.f31622a;
    }

    public static final z VoicesCarouselUI$lambda$1$0$1$0$1(Voice voice, s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.j jVar = d.C0;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            float m2353getX2D9Ej5fM = elevenLabsTheme.getSpacings(qVar, i11).m2353getX2D9Ej5fM();
            i3.q qVar2 = i3.q.f13017a;
            t E = r1.d.E(qVar2, m2353getX2D9Ej5fM);
            x a10 = w.a(j.f29230c, jVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(E, qVar);
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
            VoiceAvatarKt.VoiceAvatar(voice.getVoiceId(), voice.getImageUrl(), p2.o(qVar2, 100), false, false, qVar, 384, 24);
            i.A(elevenLabsTheme, qVar, i11, qVar2, qVar);
            j7.d(voice.getName(), null, defpackage.f.A(elevenLabsTheme, qVar, i11), 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getSubtitleMedium500(), qVar, 0, 0, 130042);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoicesCarouselUI$lambda$2(VoiceSection.VoiceCarouselSection voiceCarouselSection, l lVar, int i10, int i11, m mVar, int i12) {
        VoicesCarouselUI(voiceCarouselSection, lVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
