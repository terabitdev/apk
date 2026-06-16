package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatComposerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.VoiceModeControlsKt;
import io.elevenlabs.ui.components.EchoRadioButtonKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14730b;

    public /* synthetic */ m0(boolean z6, int i10) {
        this.f14729a = i10;
        this.f14730b = z6;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z EchoRadioButton$lambda$1$0;
        int i10 = this.f14729a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ReadRowKt.i(this.f14730b, mVar, intValue);
            case 1:
                return AgentChatComposerKt.b(this.f14730b, mVar, intValue);
            case 2:
                return VoiceModeControlsKt.b(this.f14730b, mVar, intValue);
            default:
                EchoRadioButton$lambda$1$0 = EchoRadioButtonKt.EchoRadioButton$lambda$1$0(this.f14730b, mVar, intValue);
                return EchoRadioButton$lambda$1$0;
        }
    }
}
