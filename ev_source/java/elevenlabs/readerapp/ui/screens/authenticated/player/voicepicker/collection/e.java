package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel$handleLoadCollection$1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16367a;

    public /* synthetic */ e(int i10) {
        this.f16367a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z Preview_VoiceCollectionScreen_Loading$lambda$1$0;
        z Preview_VoiceCollectionScreen_Data$lambda$1$0;
        z Preview_VoiceCollectionScreen_Error$lambda$1$0;
        switch (this.f16367a) {
            case 0:
                return VoicePickerCollectionViewModel$handleLoadCollection$1.AnonymousClass1.b((VoicePickerCollectionState) obj);
            case 1:
                return VoicePickerCollectionViewModel$handleLoadCollection$1.AnonymousClass1.a((VoicePickerCollectionState) obj);
            case 2:
                Preview_VoiceCollectionScreen_Loading$lambda$1$0 = VoicePickerCollectionScreenKt.Preview_VoiceCollectionScreen_Loading$lambda$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceCollectionScreen_Loading$lambda$1$0;
            case 3:
                Preview_VoiceCollectionScreen_Data$lambda$1$0 = VoicePickerCollectionScreenKt.Preview_VoiceCollectionScreen_Data$lambda$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceCollectionScreen_Data$lambda$1$0;
            default:
                Preview_VoiceCollectionScreen_Error$lambda$1$0 = VoicePickerCollectionScreenKt.Preview_VoiceCollectionScreen_Error$lambda$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceCollectionScreen_Error$lambda$1$0;
        }
    }
}
