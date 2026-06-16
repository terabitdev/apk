package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatComposerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.VoiceModeControlsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicePickerVoiceRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.ui.components.EchoToggleKt;
import io.elevenlabs.ui.components.EchoToggleSize;
import io.elevenlabs.ui.components.VoiceAvatarKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14567c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14570f;

    public /* synthetic */ e0(ho.l lVar, ho.a aVar, boolean z6, i3.t tVar, boolean z10, int i10, int i11) {
        this.f14565a = 1;
        this.Y = lVar;
        this.Z = aVar;
        this.f14566b = z6;
        this.f14567c = tVar;
        this.f14568d = z10;
        this.f14569e = i10;
        this.f14570f = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PublicReadMetaRow$lambda$3;
        sn.z AgentChatComposer$lambda$4;
        sn.z VoiceModeControls$lambda$2;
        sn.z VoicePickerVoiceRow$lambda$4;
        sn.z EchoToggle$lambda$4;
        sn.z VoiceAvatar$lambda$2;
        switch (this.f14565a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PublicReadMetaRow$lambda$3 = ReadMetaRowKt.PublicReadMetaRow$lambda$3((ReadMeta) this.Y, (i3.t) this.f14567c, (String) this.Z, this.f14566b, this.f14568d, this.f14569e, this.f14570f, (u2.m) obj, intValue);
                return PublicReadMetaRow$lambda$3;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                AgentChatComposer$lambda$4 = AgentChatComposerKt.AgentChatComposer$lambda$4((ho.l) this.Y, (ho.a) this.Z, this.f14566b, (i3.t) this.f14567c, this.f14568d, this.f14569e, this.f14570f, (u2.m) obj, intValue2);
                return AgentChatComposer$lambda$4;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                VoiceModeControls$lambda$2 = VoiceModeControlsKt.VoiceModeControls$lambda$2(this.f14566b, this.f14568d, (ho.a) this.Y, (ho.a) this.Z, (i3.t) this.f14567c, this.f14569e, this.f14570f, (u2.m) obj, intValue3);
                return VoiceModeControls$lambda$2;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                VoicePickerVoiceRow$lambda$4 = VoicePickerVoiceRowKt.VoicePickerVoiceRow$lambda$4((Voice) this.Y, (VoicePickerSharedContract.State) this.f14567c, (ho.l) this.Z, this.f14566b, this.f14568d, this.f14569e, this.f14570f, (u2.m) obj, intValue4);
                return VoicePickerVoiceRow$lambda$4;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                EchoToggle$lambda$4 = EchoToggleKt.EchoToggle$lambda$4(this.f14566b, (ho.l) this.Y, (i3.t) this.f14567c, (EchoToggleSize) this.Z, this.f14568d, this.f14569e, this.f14570f, (u2.m) obj, intValue5);
                return EchoToggle$lambda$4;
            default:
                int intValue6 = ((Integer) obj2).intValue();
                VoiceAvatar$lambda$2 = VoiceAvatarKt.VoiceAvatar$lambda$2((String) this.Z, (String) this.Y, (i3.t) this.f14567c, this.f14566b, this.f14568d, this.f14569e, this.f14570f, (u2.m) obj, intValue6);
                return VoiceAvatar$lambda$2;
        }
    }

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, boolean z6, boolean z10, int i10, int i11, int i12) {
        this.f14565a = i12;
        this.Y = obj;
        this.f14567c = obj2;
        this.Z = obj3;
        this.f14566b = z6;
        this.f14568d = z10;
        this.f14569e = i10;
        this.f14570f = i11;
    }

    public /* synthetic */ e0(String str, String str2, i3.t tVar, boolean z6, boolean z10, int i10, int i11) {
        this.f14565a = 5;
        this.Z = str;
        this.Y = str2;
        this.f14567c = tVar;
        this.f14566b = z6;
        this.f14568d = z10;
        this.f14569e = i10;
        this.f14570f = i11;
    }

    public /* synthetic */ e0(boolean z6, ho.l lVar, i3.t tVar, EchoToggleSize echoToggleSize, boolean z10, int i10, int i11) {
        this.f14565a = 4;
        this.f14566b = z6;
        this.Y = lVar;
        this.f14567c = tVar;
        this.Z = echoToggleSize;
        this.f14568d = z10;
        this.f14569e = i10;
        this.f14570f = i11;
    }

    public /* synthetic */ e0(boolean z6, boolean z10, ho.a aVar, ho.a aVar2, i3.t tVar, int i10, int i11) {
        this.f14565a = 2;
        this.f14566b = z6;
        this.f14568d = z10;
        this.Y = aVar;
        this.Z = aVar2;
        this.f14567c = tVar;
        this.f14569e = i10;
        this.f14570f = i11;
    }
}
