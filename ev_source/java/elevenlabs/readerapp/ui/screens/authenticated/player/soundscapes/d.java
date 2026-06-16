package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import android.content.Context;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16319b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f16318a = i10;
        this.f16319b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z SoundscapeControls$lambda$0$0$0;
        z SoundscapeControls$lambda$0$1$0;
        z SoundscapesUI$lambda$1$0$0$0$0;
        z SoundscapesUI$lambda$0$0$0$0;
        z FeedbackCallout$lambda$0$0;
        switch (this.f16318a) {
            case 0:
                SoundscapeControls$lambda$0$0$0 = SoundscapesScreenKt.SoundscapeControls$lambda$0$0$0((ho.l) this.f16319b);
                return SoundscapeControls$lambda$0$0$0;
            case 1:
                SoundscapeControls$lambda$0$1$0 = SoundscapesScreenKt.SoundscapeControls$lambda$0$1$0((ho.l) this.f16319b);
                return SoundscapeControls$lambda$0$1$0;
            case 2:
                SoundscapesUI$lambda$1$0$0$0$0 = SoundscapesScreenKt.SoundscapesUI$lambda$1$0$0$0$0((ho.l) this.f16319b);
                return SoundscapesUI$lambda$1$0$0$0$0;
            case 3:
                SoundscapesUI$lambda$0$0$0$0 = SoundscapesScreenKt.SoundscapesUI$lambda$0$0$0$0((ho.l) this.f16319b);
                return SoundscapesUI$lambda$0$0$0$0;
            default:
                FeedbackCallout$lambda$0$0 = SoundscapesScreenKt.FeedbackCallout$lambda$0$0((Context) this.f16319b);
                return FeedbackCallout$lambda$0$0;
        }
    }
}
