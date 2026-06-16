package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import ho.l;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.favorites.VoicePickerFavoritesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerDesignVoiceSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerSectionsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import p4.b0;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16291a;

    public /* synthetic */ d(int i10) {
        this.f16291a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        Object PlayerQueueUI_AjpBEmI$lambda$8$0$1;
        z Preview_PlayerPlaylistScreen_NonEmptyQueue$lambda$0$0$0;
        z Preview_VoiceCreatedScreen_Loading_NonEmptyItems$lambda$0$0$0;
        z Preview_VoiceCreatedScreen_Error_NonEmptyItems$lambda$0$0$0;
        z Preview_VoiceCreatedScreen_Error$lambda$0$0$0;
        z Preview_VoiceCreatedScreen_Loading$lambda$0$0$0;
        z Preview_VoiceCreatedScreen_Data$lambda$0$0$0;
        z Preview_VoiceFavoritesScreen_Data$lambda$0$0$0;
        z Preview_VoiceFavoritesScreen_Loading_NonEmptyItems$lambda$0$0$0;
        z Preview_VoiceFavoritesScreen_Error_NonEmptyItems$lambda$0$0$0;
        z Preview_VoiceFavoritesScreen_Error$lambda$0$0$0;
        z Preview_VoiceFavoritesScreen_Loading$lambda$0$0$0;
        z Preview_VoiceRecentsScreen_Loading_NonEmptyItems$lambda$0$1$0;
        z Preview_VoiceRecentsScreen_Loading$lambda$0$1$0;
        z Preview_VoiceRecentsScreen_Error_NonEmptyItems$lambda$0$1$0;
        z Preview_VoiceRecentsScreen_Data$lambda$0$1$0;
        z Preview_VoiceRecentsScreen_Error$lambda$0$1$0;
        z Preview_VoiceFilteredListScreen_Loading$lambda$0$0$0;
        z Preview_VoiceFilteredListScreen_Empty$lambda$0$1$0;
        z Preview_VoiceFilteredListScreen_Empty$lambda$0$2$0;
        z Preview_VoiceFilteredListScreen_Loading$lambda$0$1$0;
        z Preview_VoiceFilteredListScreen_Loading$lambda$0$2$0;
        z Preview_VoiceFilteredListScreen_Data$lambda$0$0$0;
        z Preview_VoiceFilteredListScreen_Data$lambda$0$1$0;
        z Preview_VoiceFilteredListScreen_Data$lambda$0$2$0;
        z Preview_VoiceFilteredListScreen_Empty$lambda$0$0$0;
        VoicePickerSearchListContract.State loadVoices$lambda$0;
        VoicePickerSearchListContract.State loadVoices$lambda$1;
        z VoiceDesignRow$lambda$0$0;
        z Preview_VoicePickerSectionsList$lambda$0$0$0;
        switch (this.f16291a) {
            case 0:
                PlayerQueueUI_AjpBEmI$lambda$8$0$1 = PlayerQueueScreenKt.PlayerQueueUI_AjpBEmI$lambda$8$0$1((MediaItemState) obj);
                return PlayerQueueUI_AjpBEmI$lambda$8$0$1;
            case 1:
                Preview_PlayerPlaylistScreen_NonEmptyQueue$lambda$0$0$0 = PlayerQueueScreenKt.Preview_PlayerPlaylistScreen_NonEmptyQueue$lambda$0$0$0((MediaItemState) obj);
                return Preview_PlayerPlaylistScreen_NonEmptyQueue$lambda$0$0$0;
            case 2:
                Preview_VoiceCreatedScreen_Loading_NonEmptyItems$lambda$0$0$0 = VoicePickerCreatedScreenKt.Preview_VoiceCreatedScreen_Loading_NonEmptyItems$lambda$0$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceCreatedScreen_Loading_NonEmptyItems$lambda$0$0$0;
            case 3:
                Preview_VoiceCreatedScreen_Error_NonEmptyItems$lambda$0$0$0 = VoicePickerCreatedScreenKt.Preview_VoiceCreatedScreen_Error_NonEmptyItems$lambda$0$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceCreatedScreen_Error_NonEmptyItems$lambda$0$0$0;
            case 4:
                Preview_VoiceCreatedScreen_Error$lambda$0$0$0 = VoicePickerCreatedScreenKt.Preview_VoiceCreatedScreen_Error$lambda$0$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceCreatedScreen_Error$lambda$0$0$0;
            case 5:
                Preview_VoiceCreatedScreen_Loading$lambda$0$0$0 = VoicePickerCreatedScreenKt.Preview_VoiceCreatedScreen_Loading$lambda$0$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceCreatedScreen_Loading$lambda$0$0$0;
            case 6:
                Preview_VoiceCreatedScreen_Data$lambda$0$0$0 = VoicePickerCreatedScreenKt.Preview_VoiceCreatedScreen_Data$lambda$0$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceCreatedScreen_Data$lambda$0$0$0;
            case 7:
                Preview_VoiceFavoritesScreen_Data$lambda$0$0$0 = VoicePickerFavoritesScreenKt.Preview_VoiceFavoritesScreen_Data$lambda$0$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFavoritesScreen_Data$lambda$0$0$0;
            case 8:
                Preview_VoiceFavoritesScreen_Loading_NonEmptyItems$lambda$0$0$0 = VoicePickerFavoritesScreenKt.Preview_VoiceFavoritesScreen_Loading_NonEmptyItems$lambda$0$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFavoritesScreen_Loading_NonEmptyItems$lambda$0$0$0;
            case 9:
                Preview_VoiceFavoritesScreen_Error_NonEmptyItems$lambda$0$0$0 = VoicePickerFavoritesScreenKt.Preview_VoiceFavoritesScreen_Error_NonEmptyItems$lambda$0$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFavoritesScreen_Error_NonEmptyItems$lambda$0$0$0;
            case 10:
                Preview_VoiceFavoritesScreen_Error$lambda$0$0$0 = VoicePickerFavoritesScreenKt.Preview_VoiceFavoritesScreen_Error$lambda$0$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFavoritesScreen_Error$lambda$0$0$0;
            case 11:
                Preview_VoiceFavoritesScreen_Loading$lambda$0$0$0 = VoicePickerFavoritesScreenKt.Preview_VoiceFavoritesScreen_Loading$lambda$0$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFavoritesScreen_Loading$lambda$0$0$0;
            case 12:
                Preview_VoiceRecentsScreen_Loading_NonEmptyItems$lambda$0$1$0 = VoicePickerRecentsScreenKt.Preview_VoiceRecentsScreen_Loading_NonEmptyItems$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceRecentsScreen_Loading_NonEmptyItems$lambda$0$1$0;
            case 13:
                Preview_VoiceRecentsScreen_Loading$lambda$0$1$0 = VoicePickerRecentsScreenKt.Preview_VoiceRecentsScreen_Loading$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceRecentsScreen_Loading$lambda$0$1$0;
            case 14:
                Preview_VoiceRecentsScreen_Error_NonEmptyItems$lambda$0$1$0 = VoicePickerRecentsScreenKt.Preview_VoiceRecentsScreen_Error_NonEmptyItems$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceRecentsScreen_Error_NonEmptyItems$lambda$0$1$0;
            case 15:
                Preview_VoiceRecentsScreen_Data$lambda$0$1$0 = VoicePickerRecentsScreenKt.Preview_VoiceRecentsScreen_Data$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceRecentsScreen_Data$lambda$0$1$0;
            case 16:
                Preview_VoiceRecentsScreen_Error$lambda$0$1$0 = VoicePickerRecentsScreenKt.Preview_VoiceRecentsScreen_Error$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceRecentsScreen_Error$lambda$0$1$0;
            case 17:
                Preview_VoiceFilteredListScreen_Loading$lambda$0$0$0 = VoicePickerSearchListScreenKt.Preview_VoiceFilteredListScreen_Loading$lambda$0$0$0((VoicePickerSearchListContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Loading$lambda$0$0$0;
            case 18:
                Preview_VoiceFilteredListScreen_Empty$lambda$0$1$0 = VoicePickerSearchListScreenKt.Preview_VoiceFilteredListScreen_Empty$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Empty$lambda$0$1$0;
            case 19:
                Preview_VoiceFilteredListScreen_Empty$lambda$0$2$0 = VoicePickerSearchListScreenKt.Preview_VoiceFilteredListScreen_Empty$lambda$0$2$0((VoicePickerSharedContract.NavigationEvent) obj);
                return Preview_VoiceFilteredListScreen_Empty$lambda$0$2$0;
            case 20:
                Preview_VoiceFilteredListScreen_Loading$lambda$0$1$0 = VoicePickerSearchListScreenKt.Preview_VoiceFilteredListScreen_Loading$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Loading$lambda$0$1$0;
            case 21:
                Preview_VoiceFilteredListScreen_Loading$lambda$0$2$0 = VoicePickerSearchListScreenKt.Preview_VoiceFilteredListScreen_Loading$lambda$0$2$0((VoicePickerSharedContract.NavigationEvent) obj);
                return Preview_VoiceFilteredListScreen_Loading$lambda$0$2$0;
            case 22:
                Preview_VoiceFilteredListScreen_Data$lambda$0$0$0 = VoicePickerSearchListScreenKt.Preview_VoiceFilteredListScreen_Data$lambda$0$0$0((VoicePickerSearchListContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Data$lambda$0$0$0;
            case 23:
                Preview_VoiceFilteredListScreen_Data$lambda$0$1$0 = VoicePickerSearchListScreenKt.Preview_VoiceFilteredListScreen_Data$lambda$0$1$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Data$lambda$0$1$0;
            case 24:
                Preview_VoiceFilteredListScreen_Data$lambda$0$2$0 = VoicePickerSearchListScreenKt.Preview_VoiceFilteredListScreen_Data$lambda$0$2$0((VoicePickerSharedContract.NavigationEvent) obj);
                return Preview_VoiceFilteredListScreen_Data$lambda$0$2$0;
            case 25:
                Preview_VoiceFilteredListScreen_Empty$lambda$0$0$0 = VoicePickerSearchListScreenKt.Preview_VoiceFilteredListScreen_Empty$lambda$0$0$0((VoicePickerSearchListContract.Event) obj);
                return Preview_VoiceFilteredListScreen_Empty$lambda$0$0$0;
            case 26:
                loadVoices$lambda$0 = VoicePickerSearchListViewModel.loadVoices$lambda$0((VoicePickerSearchListContract.State) obj);
                return loadVoices$lambda$0;
            case 27:
                loadVoices$lambda$1 = VoicePickerSearchListViewModel.loadVoices$lambda$1((VoicePickerSearchListContract.State) obj);
                return loadVoices$lambda$1;
            case 28:
                VoiceDesignRow$lambda$0$0 = VoicePickerDesignVoiceSectionKt.VoiceDesignRow$lambda$0$0((b0) obj);
                return VoiceDesignRow$lambda$0$0;
            default:
                Preview_VoicePickerSectionsList$lambda$0$0$0 = VoicePickerSectionsListKt.Preview_VoicePickerSectionsList$lambda$0$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoicePickerSectionsList$lambda$0$0$0;
        }
    }
}
