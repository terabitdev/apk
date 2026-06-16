package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.AudioOnlyPlayerUiKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerFloatingBottomControlsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerScreenPreviewsKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15801b;

    public /* synthetic */ a0(int i10, int i11) {
        this.f15800a = i11;
        this.f15801b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Preview_LibraryScreen_Error$lambda$1;
        sn.z Preview_LibraryScreen_Collections_loaded$lambda$1;
        sn.z Preview_LibraryScreen_Collections_error$lambda$1;
        sn.z Preview_LibraryScreen_Collections_loading$lambda$1;
        int i10 = this.f15800a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                Preview_LibraryScreen_Error$lambda$1 = LibraryScreenKt.Preview_LibraryScreen_Error$lambda$1(this.f15801b, mVar, intValue);
                return Preview_LibraryScreen_Error$lambda$1;
            case 1:
                Preview_LibraryScreen_Collections_loaded$lambda$1 = LibraryScreenKt.Preview_LibraryScreen_Collections_loaded$lambda$1(this.f15801b, mVar, intValue);
                return Preview_LibraryScreen_Collections_loaded$lambda$1;
            case 2:
                Preview_LibraryScreen_Collections_error$lambda$1 = LibraryScreenKt.Preview_LibraryScreen_Collections_error$lambda$1(this.f15801b, mVar, intValue);
                return Preview_LibraryScreen_Collections_error$lambda$1;
            case 3:
                Preview_LibraryScreen_Collections_loading$lambda$1 = LibraryScreenKt.Preview_LibraryScreen_Collections_loading$lambda$1(this.f15801b, mVar, intValue);
                return Preview_LibraryScreen_Collections_loading$lambda$1;
            case 4:
                return AudioOnlyPlayerUiKt.f(this.f15801b, mVar, intValue);
            case 5:
                return AudioOnlyPlayerUiKt.i(this.f15801b, mVar, intValue);
            case 6:
                return AudioOnlyPlayerUiKt.e(this.f15801b, mVar, intValue);
            case 7:
                return AudioOnlyPlayerUiKt.g(this.f15801b, mVar, intValue);
            case 8:
                return AudioOnlyPlayerUiKt.l(this.f15801b, mVar, intValue);
            case 9:
                return AudioOnlyPlayerUiKt.b(this.f15801b, mVar, intValue);
            case 10:
                return PlayerFloatingBottomControlsKt.h(this.f15801b, mVar, intValue);
            case 11:
                return PlayerFloatingBottomControlsKt.b(this.f15801b, mVar, intValue);
            case 12:
                return PlayerPreferencesScreenKt.b(this.f15801b, mVar, intValue);
            case 13:
                return PlayerScreenPreviewsKt.e(this.f15801b, mVar, intValue);
            case 14:
                return PlayerScreenPreviewsKt.c(this.f15801b, mVar, intValue);
            case 15:
                return PlayerScreenPreviewsKt.o(this.f15801b, mVar, intValue);
            case 16:
                return PlayerScreenPreviewsKt.r(this.f15801b, mVar, intValue);
            case 17:
                return PlayerScreenPreviewsKt.s(this.f15801b, mVar, intValue);
            case 18:
                return PlayerScreenPreviewsKt.h(this.f15801b, mVar, intValue);
            case 19:
                return PlayerScreenPreviewsKt.k(this.f15801b, mVar, intValue);
            case 20:
                return PlayerScreenPreviewsKt.f(this.f15801b, mVar, intValue);
            case 21:
                return PlayerScreenPreviewsKt.j(this.f15801b, mVar, intValue);
            case 22:
                return PlayerScreenPreviewsKt.d(this.f15801b, mVar, intValue);
            case 23:
                return PlayerScreenPreviewsKt.g(this.f15801b, mVar, intValue);
            case 24:
                return PlayerScreenPreviewsKt.m(this.f15801b, mVar, intValue);
            case 25:
                return PlayerScreenPreviewsKt.l(this.f15801b, mVar, intValue);
            case 26:
                return PlayerScreenPreviewsKt.a(this.f15801b, mVar, intValue);
            case 27:
                return PlayerScreenPreviewsKt.p(this.f15801b, mVar, intValue);
            case 28:
                return PlayerScreenPreviewsKt.b(this.f15801b, mVar, intValue);
            default:
                return PlayerScreenPreviewsKt.i(this.f15801b, mVar, intValue);
        }
    }
}
