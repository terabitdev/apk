package io.elevenlabs.audio;

import android.media.AudioManager;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13997a;

    public /* synthetic */ b(int i10) {
        this.f13997a = i10;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        switch (this.f13997a) {
            case 0:
                AudioUtils.a(i10);
                return;
            case 1:
                AudioUtils.b(i10);
                return;
            default:
                AudioUtils.c(i10);
                return;
        }
    }
}
