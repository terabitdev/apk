package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import android.view.View;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.ui.theme.ElevenLabsColors;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15436a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15439d;

    public /* synthetic */ i(View view, ElevenLabsColors elevenLabsColors, boolean z6) {
        this.f15438c = view;
        this.f15439d = elevenLabsColors;
        this.f15437b = z6;
    }

    @Override // ho.a
    public final Object invoke() {
        z MultiOptionFilterBottomSheet$lambda$3$0$4$1$0$1$0;
        switch (this.f15436a) {
            case 0:
                MultiOptionFilterBottomSheet$lambda$3$0$4$1$0$1$0 = MultiOptionFilterBottomSheetKt.MultiOptionFilterBottomSheet$lambda$3$0$4$1$0$1$0(this.f15437b, (KeyLabel) this.f15438c, (z0) this.f15439d);
                return MultiOptionFilterBottomSheet$lambda$3$0$4$1$0$1$0;
            default:
                return ElevenLabsThemeKt.h((View) this.f15438c, (ElevenLabsColors) this.f15439d, this.f15437b);
        }
    }

    public /* synthetic */ i(boolean z6, KeyLabel keyLabel, z0 z0Var) {
        this.f15437b = z6;
        this.f15438c = keyLabel;
        this.f15439d = z0Var;
    }
}
