package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import ho.p;
import ho.q;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import r1.l2;
import sn.z;
import u2.m;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17185b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f17184a = i10;
        this.f17185b = obj;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z lambda__1086828725$lambda$0$0;
        z VoicePromptStep$lambda$0$4$2;
        switch (this.f17184a) {
            case 0:
                lambda__1086828725$lambda$0$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda__1086828725$lambda$0$0((BottomSheetControl) this.f17185b, (l2) obj, (m) obj2, ((Integer) obj3).intValue());
                return lambda__1086828725$lambda$0$0;
            default:
                VoicePromptStep$lambda$0$4$2 = VoicePromptStepKt.VoicePromptStep$lambda$0$4$2((z0) this.f17185b, (p) obj, (m) obj2, ((Integer) obj3).intValue());
                return VoicePromptStep$lambda$0$4$2;
        }
    }
}
