package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f16113b;

    public /* synthetic */ j(z0 z0Var, int i10) {
        this.f16112a = i10;
        this.f16113b = z0Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z ContentSearchBottomSheetUI$lambda$2$7$0$0;
        sn.z RenameDialog$lambda$4$1$0;
        sn.z RenameDialog$lambda$4$3$0;
        switch (this.f16112a) {
            case 0:
                ContentSearchBottomSheetUI$lambda$2$7$0$0 = ContentSearchSheetKt.ContentSearchBottomSheetUI$lambda$2$7$0$0(this.f16113b, (ContentSearchViewModel) obj);
                return ContentSearchBottomSheetUI$lambda$2$7$0$0;
            case 1:
                RenameDialog$lambda$4$1$0 = RenameDialogKt.RenameDialog$lambda$4$1$0(this.f16113b, (n3.z) obj);
                return RenameDialog$lambda$4$1$0;
            default:
                RenameDialog$lambda$4$3$0 = RenameDialogKt.RenameDialog$lambda$4$3$0(this.f16113b, (y4.w) obj);
                return RenameDialog$lambda$4$3$0;
        }
    }
}
