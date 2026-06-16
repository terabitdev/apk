package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import ho.p;
import io.elevenlabs.domain.model.Voice;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16399a;

    public /* synthetic */ a(int i10) {
        this.f16399a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        Object VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$4$0$0;
        switch (this.f16399a) {
            case 0:
                return ComposableSingletons$PreviewVoiceFilteredListScreenDataDefaultGroupPreviewVoiceFilteredListScreenData1Kt.a((m) obj, ((Integer) obj2).intValue());
            case 1:
                return ComposableSingletons$PreviewVoiceFilteredListScreenDataDefaultGroupPreviewVoiceFilteredListScreenDataKt.a((m) obj, ((Integer) obj2).intValue());
            case 2:
                return ComposableSingletons$PreviewVoiceFilteredListScreenEmptyDefaultGroupPreviewVoiceFilteredListScreenEmpty1Kt.a((m) obj, ((Integer) obj2).intValue());
            case 3:
                return ComposableSingletons$PreviewVoiceFilteredListScreenEmptyDefaultGroupPreviewVoiceFilteredListScreenEmptyKt.a((m) obj, ((Integer) obj2).intValue());
            case 4:
                return ComposableSingletons$PreviewVoiceFilteredListScreenErrorDefaultGroupPreviewVoiceFilteredListScreenError1Kt.a((m) obj, ((Integer) obj2).intValue());
            case 5:
                return ComposableSingletons$PreviewVoiceFilteredListScreenErrorDefaultGroupPreviewVoiceFilteredListScreenErrorKt.a((m) obj, ((Integer) obj2).intValue());
            case 6:
                return ComposableSingletons$PreviewVoiceFilteredListScreenLoadingDefaultGroupPreviewVoiceFilteredListScreenLoading1Kt.a((m) obj, ((Integer) obj2).intValue());
            case 7:
                return ComposableSingletons$PreviewVoiceFilteredListScreenLoadingDefaultGroupPreviewVoiceFilteredListScreenLoadingKt.a((m) obj, ((Integer) obj2).intValue());
            default:
                VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$4$0$0 = VoicePickerFilteredListScreenKt.VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$4$0$0(((Integer) obj).intValue(), (Voice) obj2);
                return VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$4$0$0;
        }
    }
}
