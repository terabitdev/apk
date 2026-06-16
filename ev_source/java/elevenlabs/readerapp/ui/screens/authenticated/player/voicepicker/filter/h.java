package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16416a;

    public /* synthetic */ h(int i10) {
        this.f16416a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        VoicePickerFilteredListContract.State emit$lambda$0;
        z Preview_VoiceFilteredListScreen_Empty$lambda$0$0$0;
        z Preview_VoiceFilteredListScreen_Empty$lambda$0$1$0;
        z Preview_VoiceFilteredListScreen_Data$lambda$0$0$0;
        z Preview_VoiceFilteredListScreen_Data$lambda$0$1$0;
        z Preview_VoiceFilteredListScreen_Error$lambda$0$0$0;
        z Preview_VoiceFilteredListScreen_Error$lambda$0$1$0;
        z Preview_VoiceFilteredListScreen_Loading$lambda$0$0$0;
        z Preview_VoiceFilteredListScreen_Loading$lambda$0$1$0;
        VoicePickerFilteredListContract.State loadVoices$lambda$0;
        switch (this.f16416a) {
            case 0:
                emit$lambda$0 = VoicePickerFilteredListViewModel.AnonymousClass1.AnonymousClass2.emit$lambda$0((VoicePickerFilteredListContract.State) obj);
                return emit$lambda$0;
            case 1:
                return VoicePickerFilteredListViewModel$onEvent$1.d((VoicePickerFilteredListContract.State) obj);
            case 2:
                Preview_VoiceFilteredListScreen_Empty$lambda$0$0$0 = VoicePickerFilteredListScreenKt.Preview_VoiceFilteredListScreen_Empty$lambda$0$0$0((VoicePickerFilteredListContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Empty$lambda$0$0$0;
            case 3:
                Preview_VoiceFilteredListScreen_Empty$lambda$0$1$0 = VoicePickerFilteredListScreenKt.Preview_VoiceFilteredListScreen_Empty$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Empty$lambda$0$1$0;
            case 4:
                Preview_VoiceFilteredListScreen_Data$lambda$0$0$0 = VoicePickerFilteredListScreenKt.Preview_VoiceFilteredListScreen_Data$lambda$0$0$0((VoicePickerFilteredListContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Data$lambda$0$0$0;
            case 5:
                Preview_VoiceFilteredListScreen_Data$lambda$0$1$0 = VoicePickerFilteredListScreenKt.Preview_VoiceFilteredListScreen_Data$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Data$lambda$0$1$0;
            case 6:
                Preview_VoiceFilteredListScreen_Error$lambda$0$0$0 = VoicePickerFilteredListScreenKt.Preview_VoiceFilteredListScreen_Error$lambda$0$0$0((VoicePickerFilteredListContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Error$lambda$0$0$0;
            case 7:
                Preview_VoiceFilteredListScreen_Error$lambda$0$1$0 = VoicePickerFilteredListScreenKt.Preview_VoiceFilteredListScreen_Error$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Error$lambda$0$1$0;
            case 8:
                Preview_VoiceFilteredListScreen_Loading$lambda$0$0$0 = VoicePickerFilteredListScreenKt.Preview_VoiceFilteredListScreen_Loading$lambda$0$0$0((VoicePickerFilteredListContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Loading$lambda$0$0$0;
            case 9:
                Preview_VoiceFilteredListScreen_Loading$lambda$0$1$0 = VoicePickerFilteredListScreenKt.Preview_VoiceFilteredListScreen_Loading$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Loading$lambda$0$1$0;
            default:
                loadVoices$lambda$0 = VoicePickerFilteredListViewModel.loadVoices$lambda$0((VoicePickerFilteredListContract.State) obj);
                return loadVoices$lambda$0;
        }
    }
}
