package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.model.ReadMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadMeta f15837b;

    public /* synthetic */ g(int i10, ReadMeta readMeta) {
        this.f15836a = i10;
        this.f15837b = readMeta;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z SavedItem$lambda$3;
        sn.z ArchiveItem$lambda$3;
        int i10 = this.f15836a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                SavedItem$lambda$3 = LibraryScreenKt.SavedItem$lambda$3(this.f15837b, mVar, intValue);
                return SavedItem$lambda$3;
            default:
                ArchiveItem$lambda$3 = LibraryScreenKt.ArchiveItem$lambda$3(this.f15837b, mVar, intValue);
                return ArchiveItem$lambda$3;
        }
    }
}
