package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f17199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VoiceDesignContract.PreviewItem f17200d;

    public /* synthetic */ g(boolean z6, ho.l lVar, VoiceDesignContract.PreviewItem previewItem, int i10) {
        this.f17197a = i10;
        this.f17198b = z6;
        this.f17199c = lVar;
        this.f17200d = previewItem;
    }

    @Override // ho.a
    public final Object invoke() {
        z SaveVoiceStep$lambda$0$0$0$1$0;
        z SaveVoiceStep$lambda$0$0$0$3$0$0;
        z SelectPreviewStep$lambda$0$0$0$2$0$0;
        switch (this.f17197a) {
            case 0:
                SaveVoiceStep$lambda$0$0$0$1$0 = SaveVoiceStepKt.SaveVoiceStep$lambda$0$0$0$1$0(this.f17198b, this.f17199c, this.f17200d);
                return SaveVoiceStep$lambda$0$0$0$1$0;
            case 1:
                SaveVoiceStep$lambda$0$0$0$3$0$0 = SaveVoiceStepKt.SaveVoiceStep$lambda$0$0$0$3$0$0(this.f17198b, this.f17199c, this.f17200d);
                return SaveVoiceStep$lambda$0$0$0$3$0$0;
            default:
                SelectPreviewStep$lambda$0$0$0$2$0$0 = SelectPreviewStepKt.SelectPreviewStep$lambda$0$0$0$2$0$0(this.f17198b, this.f17199c, this.f17200d);
                return SelectPreviewStep$lambda$0$0$0$2$0$0;
        }
    }
}
