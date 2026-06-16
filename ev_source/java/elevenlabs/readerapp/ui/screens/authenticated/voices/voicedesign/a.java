package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import ho.p;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17162a;

    public /* synthetic */ a(int i10) {
        this.f17162a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f17162a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ComposableSingletons$PreviewVoiceDesignScreenGeneratingStepDefaultGroupPreviewVoiceDesignScreenGeneratingStep1Kt.a(mVar, intValue);
            case 1:
                return ComposableSingletons$PreviewVoiceDesignScreenGeneratingStepDefaultGroupPreviewVoiceDesignScreenGeneratingStepKt.a(mVar, intValue);
            case 2:
                return ComposableSingletons$PreviewVoiceDesignScreenPromptStepDefaultGroupPreviewVoiceDesignScreenPromptStep1Kt.a(mVar, intValue);
            case 3:
                return ComposableSingletons$PreviewVoiceDesignScreenPromptStepDefaultGroupPreviewVoiceDesignScreenPromptStepKt.a(mVar, intValue);
            case 4:
                return ComposableSingletons$VoiceDesignScreenKt.b(mVar, intValue);
            default:
                return ComposableSingletons$VoiceDesignScreenKt.a(mVar, intValue);
        }
    }
}
