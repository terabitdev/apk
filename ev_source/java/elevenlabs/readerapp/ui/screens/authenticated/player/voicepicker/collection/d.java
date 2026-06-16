package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

import ho.l;
import io.elevenlabs.domain.model.VoiceCollectionWithVoices;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel$actualiseVoices$1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel$handleLoadCollection$1;
import java.util.LinkedHashMap;
import u2.h0;
import u2.i0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16366b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f16365a = i10;
        this.f16366b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        VoicePickerCollectionState emit$lambda$1;
        VoicePickerCollectionViewModel VoicePickerCollectionScreen$lambda$0$0;
        h0 VoicePickerCollectionScreen$lambda$3$0;
        switch (this.f16365a) {
            case 0:
                return VoicePickerCollectionViewModel$actualiseVoices$1.AnonymousClass1.a((LinkedHashMap) this.f16366b, (VoicePickerCollectionState) obj);
            case 1:
                emit$lambda$1 = VoicePickerCollectionViewModel$handleLoadCollection$1.AnonymousClass1.emit$lambda$1((VoiceCollectionWithVoices) this.f16366b, (VoicePickerCollectionState) obj);
                return emit$lambda$1;
            case 2:
                VoicePickerCollectionScreen$lambda$0$0 = VoicePickerCollectionScreenKt.VoicePickerCollectionScreen$lambda$0$0((VoicePickerCollectionRoute) this.f16366b, (VoicePickerCollectionViewModel.Factory) obj);
                return VoicePickerCollectionScreen$lambda$0$0;
            default:
                VoicePickerCollectionScreen$lambda$3$0 = VoicePickerCollectionScreenKt.VoicePickerCollectionScreen$lambda$3$0((VoicePickerCollectionViewModel) this.f16366b, (i0) obj);
                return VoicePickerCollectionScreen$lambda$3$0;
        }
    }
}
