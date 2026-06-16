package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import c3.o;
import f4.f1;
import ho.p;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import r1.p2;
import sn.z;
import u2.m;
import u2.q;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$SaveVoiceStepKt {
    public static final ComposableSingletons$SaveVoiceStepKt INSTANCE = new ComposableSingletons$SaveVoiceStepKt();

    /* renamed from: lambda$-1404774262 */
    private static p f633lambda$1404774262 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.series.a(27), false, -1404774262);

    /* renamed from: lambda$-1453941496 */
    private static p f634lambda$1453941496 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.series.a(28), false, -1453941496);

    public static final z lambda__1404774262$lambda$0(m mVar, int i10) {
        boolean z6;
        VoiceDesignContract.PreviewItem previewItem;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            VoiceDesignContract.Step step = VoiceDesignContract.Step.SAVE_VOICE;
            previewItem = SaveVoiceStepKt.MockSelectedPreview;
            VoiceDesignContract.State state = new VoiceDesignContract.State(step, null, false, ig.f.H(previewItem), null, 0, "", false, null, false, false, null, null, false, 16278, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(11);
                qVar.h0(L);
            }
            SaveVoiceStepKt.SaveVoiceStep(state, (ho.l) L, null, qVar, 48, 4);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1404774262$lambda$0$0$0$0(VoiceDesignContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z lambda__1453941496$lambda$0(m mVar, int i10) {
        boolean z6;
        VoiceDesignContract.PreviewItem previewItem;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            VoiceDesignContract.Step step = VoiceDesignContract.Step.SAVE_VOICE;
            previewItem = SaveVoiceStepKt.MockSelectedPreview;
            VoiceDesignContract.State state = new VoiceDesignContract.State(step, null, false, ig.f.H(previewItem), null, 0, "My Custom Voice", false, null, false, false, null, null, false, 16278, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(10);
                qVar.h0(L);
            }
            SaveVoiceStepKt.SaveVoiceStep(state, (ho.l) L, null, qVar, 48, 4);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1453941496$lambda$0$0$0$0(VoiceDesignContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-1404774262$app_productionRelease */
    public final p m1763getLambda$1404774262$app_productionRelease() {
        return f633lambda$1404774262;
    }

    /* renamed from: getLambda$-1453941496$app_productionRelease */
    public final p m1764getLambda$1453941496$app_productionRelease() {
        return f634lambda$1453941496;
    }
}
