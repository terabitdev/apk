package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.ReadMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15830a;

    public /* synthetic */ e0(int i10) {
        this.f15830a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z Preview_LibraryScreen_Playing$lambda$0$0;
        Object LibraryScreenUI$lambda$7$0$10$4$0$3;
        Object userCollections$lambda$4;
        sn.z LibraryScreenUI$lambda$1$0;
        sn.z LibraryScreenUI$lambda$4$0;
        sn.z Tabs$lambda$0$0$0$0$0$0;
        sn.z Preview_LibraryScreen_Empty$lambda$0$0;
        sn.z Preview_LibraryScreen_Idle$lambda$0$0;
        sn.z Tabs$lambda$0$0$1$0$0$0;
        sn.z Preview_LibraryScreen_Synced$lambda$0$0;
        sn.z Preview_LibraryScreen_Error$lambda$0$0;
        sn.z Preview_LibraryScreen_Collections_loaded$lambda$0$0;
        sn.z Preview_LibraryScreen_Collections_error$lambda$0$0;
        sn.z Tabs$lambda$0$0$2$0$0$0;
        sn.z Preview_LibraryScreen_Collections_loading$lambda$0$0;
        Object typeCollections$lambda$0;
        LibraryState loadNextPage$lambda$0;
        switch (this.f15830a) {
            case 0:
                return LibraryScreenKt$LibraryScreenUI$8$1$1$1$1.d((LibraryViewModel) obj);
            case 1:
                Preview_LibraryScreen_Playing$lambda$0$0 = LibraryScreenKt.Preview_LibraryScreen_Playing$lambda$0$0((ho.l) obj);
                return Preview_LibraryScreen_Playing$lambda$0$0;
            case 2:
                LibraryScreenUI$lambda$7$0$10$4$0$3 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$4$0$3((ReadMeta) obj);
                return LibraryScreenUI$lambda$7$0$10$4$0$3;
            case 3:
                userCollections$lambda$4 = LibraryScreenKt.userCollections$lambda$4((CollectionMeta) obj);
                return userCollections$lambda$4;
            case 4:
                LibraryScreenUI$lambda$1$0 = LibraryScreenKt.LibraryScreenUI$lambda$1$0((String) obj);
                return LibraryScreenUI$lambda$1$0;
            case 5:
                LibraryScreenUI$lambda$4$0 = LibraryScreenKt.LibraryScreenUI$lambda$4$0((String) obj);
                return LibraryScreenUI$lambda$4$0;
            case 6:
                Tabs$lambda$0$0$0$0$0$0 = LibraryScreenKt.Tabs$lambda$0$0$0$0$0$0((LibraryViewModel) obj);
                return Tabs$lambda$0$0$0$0$0$0;
            case 7:
                Preview_LibraryScreen_Empty$lambda$0$0 = LibraryScreenKt.Preview_LibraryScreen_Empty$lambda$0$0((ho.l) obj);
                return Preview_LibraryScreen_Empty$lambda$0$0;
            case 8:
                Preview_LibraryScreen_Idle$lambda$0$0 = LibraryScreenKt.Preview_LibraryScreen_Idle$lambda$0$0((ho.l) obj);
                return Preview_LibraryScreen_Idle$lambda$0$0;
            case 9:
                Tabs$lambda$0$0$1$0$0$0 = LibraryScreenKt.Tabs$lambda$0$0$1$0$0$0((LibraryViewModel) obj);
                return Tabs$lambda$0$0$1$0$0$0;
            case 10:
                Preview_LibraryScreen_Synced$lambda$0$0 = LibraryScreenKt.Preview_LibraryScreen_Synced$lambda$0$0((ho.l) obj);
                return Preview_LibraryScreen_Synced$lambda$0$0;
            case 11:
                Preview_LibraryScreen_Error$lambda$0$0 = LibraryScreenKt.Preview_LibraryScreen_Error$lambda$0$0((ho.l) obj);
                return Preview_LibraryScreen_Error$lambda$0$0;
            case 12:
                Preview_LibraryScreen_Collections_loaded$lambda$0$0 = LibraryScreenKt.Preview_LibraryScreen_Collections_loaded$lambda$0$0((ho.l) obj);
                return Preview_LibraryScreen_Collections_loaded$lambda$0$0;
            case 13:
                Preview_LibraryScreen_Collections_error$lambda$0$0 = LibraryScreenKt.Preview_LibraryScreen_Collections_error$lambda$0$0((ho.l) obj);
                return Preview_LibraryScreen_Collections_error$lambda$0$0;
            case 14:
                Tabs$lambda$0$0$2$0$0$0 = LibraryScreenKt.Tabs$lambda$0$0$2$0$0$0((LibraryViewModel) obj);
                return Tabs$lambda$0$0$2$0$0$0;
            case 15:
                Preview_LibraryScreen_Collections_loading$lambda$0$0 = LibraryScreenKt.Preview_LibraryScreen_Collections_loading$lambda$0$0((ho.l) obj);
                return Preview_LibraryScreen_Collections_loading$lambda$0$0;
            case 16:
                typeCollections$lambda$0 = LibraryScreenKt.typeCollections$lambda$0((CollectionMeta) obj);
                return typeCollections$lambda$0;
            default:
                loadNextPage$lambda$0 = LibraryViewModel.loadNextPage$lambda$0((LibraryState) obj);
                return loadNextPage$lambda$0;
        }
    }
}
