package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerSectionsListKt;
import m2.a0;
import m2.b0;
import q2.o2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16478b;

    public /* synthetic */ k(ho.l lVar) {
        this.f16477a = 2;
        this.f16478b = lVar;
    }

    @Override // ho.a
    public final Object invoke() {
        z SelectedVoiceControls$lambda$0$1$0;
        z VoicePickerSectionsList_Q1bl1hc$lambda$0$0$2;
        switch (this.f16477a) {
            case 0:
                SelectedVoiceControls$lambda$0$1$0 = VoicePickerScreenKt.SelectedVoiceControls$lambda$0$1$0(this.f16478b);
                return SelectedVoiceControls$lambda$0$1$0;
            case 1:
                VoicePickerSectionsList_Q1bl1hc$lambda$0$0$2 = VoicePickerSectionsListKt.VoicePickerSectionsList_Q1bl1hc$lambda$0$0$2(this.f16478b);
                return VoicePickerSectionsList_Q1bl1hc$lambda$0$0$2;
            case 2:
                return new a0(b0.f22446a, this.f16478b);
            case 3:
                this.f16478b.invoke(new o2(1));
                return z.f31622a;
            default:
                this.f16478b.invoke(new o2(0));
                return z.f31622a;
        }
    }

    public /* synthetic */ k(ho.l lVar, int i10) {
        this.f16477a = i10;
        this.f16478b = lVar;
    }
}
