package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.model.ReadMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReadMeta f15829c;

    public /* synthetic */ e(ho.l lVar, ReadMeta readMeta, int i10) {
        this.f15827a = i10;
        this.f15828b = lVar;
        this.f15829c = readMeta;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z SavedItem$lambda$1$0$0$1;
        sn.z SavedItem$lambda$1$0$0$2;
        sn.z SavedItem$lambda$1$0$0$3;
        sn.z SavedItem$lambda$1$0$0$4;
        sn.z ArchiveItem$lambda$1$0$0$0;
        sn.z SavedItem$lambda$0$0;
        sn.z ArchiveItem$lambda$0$0;
        sn.z ArchiveItem$lambda$2$0;
        sn.z SavedItem$lambda$2$0;
        switch (this.f15827a) {
            case 0:
                SavedItem$lambda$1$0$0$1 = LibraryScreenKt.SavedItem$lambda$1$0$0$1(this.f15828b, this.f15829c);
                return SavedItem$lambda$1$0$0$1;
            case 1:
                SavedItem$lambda$1$0$0$2 = LibraryScreenKt.SavedItem$lambda$1$0$0$2(this.f15828b, this.f15829c);
                return SavedItem$lambda$1$0$0$2;
            case 2:
                SavedItem$lambda$1$0$0$3 = LibraryScreenKt.SavedItem$lambda$1$0$0$3(this.f15828b, this.f15829c);
                return SavedItem$lambda$1$0$0$3;
            case 3:
                SavedItem$lambda$1$0$0$4 = LibraryScreenKt.SavedItem$lambda$1$0$0$4(this.f15828b, this.f15829c);
                return SavedItem$lambda$1$0$0$4;
            case 4:
                ArchiveItem$lambda$1$0$0$0 = LibraryScreenKt.ArchiveItem$lambda$1$0$0$0(this.f15828b, this.f15829c);
                return ArchiveItem$lambda$1$0$0$0;
            case 5:
                SavedItem$lambda$0$0 = LibraryScreenKt.SavedItem$lambda$0$0(this.f15828b, this.f15829c);
                return SavedItem$lambda$0$0;
            case 6:
                ArchiveItem$lambda$0$0 = LibraryScreenKt.ArchiveItem$lambda$0$0(this.f15828b, this.f15829c);
                return ArchiveItem$lambda$0$0;
            case 7:
                ArchiveItem$lambda$2$0 = LibraryScreenKt.ArchiveItem$lambda$2$0(this.f15829c, this.f15828b);
                return ArchiveItem$lambda$2$0;
            default:
                SavedItem$lambda$2$0 = LibraryScreenKt.SavedItem$lambda$2$0(this.f15829c, this.f15828b);
                return SavedItem$lambda$2$0;
        }
    }

    public /* synthetic */ e(ReadMeta readMeta, ho.l lVar, int i10) {
        this.f15827a = i10;
        this.f15829c = readMeta;
        this.f15828b = lVar;
    }
}
