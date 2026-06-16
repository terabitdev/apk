package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import ho.p;
import j1.b2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f16480b;

    public /* synthetic */ l(p pVar, int i10) {
        this.f16479a = i10;
        this.f16480b = pVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z VoicePickerScreen$lambda$9$0$0;
        switch (this.f16479a) {
            case 0:
                VoicePickerScreen$lambda$9$0$0 = VoicePickerScreenKt.VoicePickerScreen$lambda$9$0$0(this.f16480b, (String) obj);
                return VoicePickerScreen$lambda$9$0$0;
            default:
                b2 b2Var = j1.e.f18214j;
                j1.j jVar = (j1.j) obj;
                this.f16480b.invoke(jVar.f18273e.getValue(), b2Var.f18181b.invoke(jVar.f18274f));
                return z.f31622a;
        }
    }
}
