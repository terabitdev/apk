package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import ho.p;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoiceDesignContract.State f17204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f17205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f17206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17208f;

    public /* synthetic */ i(VoiceDesignContract.State state, ho.l lVar, t tVar, int i10, int i11, int i12) {
        this.f17203a = i12;
        this.f17204b = state;
        this.f17205c = lVar;
        this.f17206d = tVar;
        this.f17207e = i10;
        this.f17208f = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z SaveVoiceStep$lambda$1;
        z SelectPreviewStep$lambda$1;
        switch (this.f17203a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SaveVoiceStep$lambda$1 = SaveVoiceStepKt.SaveVoiceStep$lambda$1(this.f17204b, this.f17205c, this.f17206d, this.f17207e, this.f17208f, (m) obj, intValue);
                return SaveVoiceStep$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SelectPreviewStep$lambda$1 = SelectPreviewStepKt.SelectPreviewStep$lambda$1(this.f17204b, this.f17205c, this.f17206d, this.f17207e, this.f17208f, (m) obj, intValue2);
                return SelectPreviewStep$lambda$1;
        }
    }
}
