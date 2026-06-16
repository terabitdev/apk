package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo;

import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.favorites.VoicePickerFavoritesScreenKt;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16101b;

    public /* synthetic */ e(int i10, int i11) {
        this.f16100a = i11;
        this.f16101b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z Preview_VoiceCollectionScreen_Loading$lambda$2;
        z Preview_VoiceCollectionScreen_Data$lambda$2;
        z Preview_VoiceCollectionScreen_Error$lambda$2;
        int i10 = this.f16100a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return PlayerButtonsKt.b(this.f16101b, mVar, intValue);
            case 1:
                return PlayerButtonsKt.c(this.f16101b, mVar, intValue);
            case 2:
                return PlayerButtonsKt.e(this.f16101b, mVar, intValue);
            case 3:
                return PlayerButtonsKt.a(this.f16101b, mVar, intValue);
            case 4:
                return PlayerButtonsKt.g(this.f16101b, mVar, intValue);
            case 5:
                return PlayerHeaderKt.f(this.f16101b, mVar, intValue);
            case 6:
                return MiniPlayerKt.h(this.f16101b, mVar, intValue);
            case 7:
                return MiniPlayerKt.g(this.f16101b, mVar, intValue);
            case 8:
                return MiniPlayerKt.j(this.f16101b, mVar, intValue);
            case 9:
                return MiniPlayerKt.b(this.f16101b, mVar, intValue);
            case 10:
                return PlayerQueueScreenKt.x(this.f16101b, mVar, intValue);
            case 11:
                return PlayerQueueScreenKt.e(this.f16101b, mVar, intValue);
            case 12:
                return PlayerQueueScreenKt.a(this.f16101b, mVar, intValue);
            case 13:
                return SoundscapesScreenKt.f(this.f16101b, mVar, intValue);
            case 14:
                return SoundscapesScreenKt.l(this.f16101b, mVar, intValue);
            case 15:
                return SoundscapesScreenKt.m(this.f16101b, mVar, intValue);
            case 16:
                return SoundscapesScreenKt.F(this.f16101b, mVar, intValue);
            case 17:
                Preview_VoiceCollectionScreen_Loading$lambda$2 = VoicePickerCollectionScreenKt.Preview_VoiceCollectionScreen_Loading$lambda$2(this.f16101b, mVar, intValue);
                return Preview_VoiceCollectionScreen_Loading$lambda$2;
            case 18:
                Preview_VoiceCollectionScreen_Data$lambda$2 = VoicePickerCollectionScreenKt.Preview_VoiceCollectionScreen_Data$lambda$2(this.f16101b, mVar, intValue);
                return Preview_VoiceCollectionScreen_Data$lambda$2;
            case 19:
                Preview_VoiceCollectionScreen_Error$lambda$2 = VoicePickerCollectionScreenKt.Preview_VoiceCollectionScreen_Error$lambda$2(this.f16101b, mVar, intValue);
                return Preview_VoiceCollectionScreen_Error$lambda$2;
            case 20:
                return VoicePickerCreatedScreenKt.d(this.f16101b, mVar, intValue);
            case 21:
                return VoicePickerCreatedScreenKt.a(this.f16101b, mVar, intValue);
            case 22:
                return VoicePickerCreatedScreenKt.c(this.f16101b, mVar, intValue);
            case 23:
                return VoicePickerCreatedScreenKt.b(this.f16101b, mVar, intValue);
            case 24:
                return VoicePickerCreatedScreenKt.j(this.f16101b, mVar, intValue);
            case 25:
                return VoicePickerFavoritesScreenKt.b(this.f16101b, mVar, intValue);
            case 26:
                return VoicePickerFavoritesScreenKt.k(this.f16101b, mVar, intValue);
            case 27:
                return VoicePickerFavoritesScreenKt.c(this.f16101b, mVar, intValue);
            case 28:
                return VoicePickerFavoritesScreenKt.g(this.f16101b, mVar, intValue);
            default:
                return VoicePickerFavoritesScreenKt.d(this.f16101b, mVar, intValue);
        }
    }
}
