package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import c3.o;
import f4.f1;
import ho.p;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignPrompt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignPrompts;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import java.util.List;
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
public final class ComposableSingletons$VoicePromptStepKt {
    public static final ComposableSingletons$VoicePromptStepKt INSTANCE = new ComposableSingletons$VoicePromptStepKt();

    /* renamed from: lambda$-106352278 */
    private static p f637lambda$106352278 = new c3.j(new a(1), false, -106352278);
    private static p lambda$763775336 = new c3.j(new a(2), false, 763775336);

    public static final z lambda_763775336$lambda$0(m mVar, int i10) {
        boolean z6;
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
            VoiceDesignContract.State state = new VoiceDesignContract.State(null, "A deep, steady male voice with calm authority and a slight British accent.", false, null, null, 0, null, false, null, false, false, null, "crisp_british_man", false, 12285, null);
            List<VoiceDesignPrompt> all_prompts = VoiceDesignPrompts.INSTANCE.getALL_PROMPTS();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(13);
                qVar.h0(L);
            }
            VoicePromptStepKt.VoicePromptStep(state, all_prompts, (ho.l) L, null, qVar, 384, 8);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_763775336$lambda$0$0$0$0(VoiceDesignContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z lambda__106352278$lambda$0(m mVar, int i10) {
        boolean z6;
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
            VoiceDesignContract.State state = new VoiceDesignContract.State(null, null, false, null, null, 0, null, false, null, false, false, null, null, false, 16383, null);
            List<VoiceDesignPrompt> all_prompts = VoiceDesignPrompts.INSTANCE.getALL_PROMPTS();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(14);
                qVar.h0(L);
            }
            VoicePromptStepKt.VoicePromptStep(state, all_prompts, (ho.l) L, null, qVar, 384, 8);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__106352278$lambda$0$0$0$0(VoiceDesignContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-106352278$app_productionRelease */
    public final p m1767getLambda$106352278$app_productionRelease() {
        return f637lambda$106352278;
    }

    public final p getLambda$763775336$app_productionRelease() {
        return lambda$763775336;
    }
}
