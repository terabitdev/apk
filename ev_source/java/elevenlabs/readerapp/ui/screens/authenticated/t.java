package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.TypingIndicatorKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt;
import io.elevenlabs.ui.components.ContainerShadowKt;
import io.elevenlabs.ui.components.UltraBadgeKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3.t f17081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17082c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17083d;

    public /* synthetic */ t(i3.t tVar, int i10, int i11, int i12) {
        this.f17080a = i12;
        this.f17081b = tVar;
        this.f17082c = i10;
        this.f17083d = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z MockDownloadItems$lambda$4;
        sn.z TypingIndicator$lambda$1;
        sn.z LoadingState$lambda$1;
        sn.z FeedbackCallout$lambda$1;
        sn.z UltraBadge$lambda$1;
        int i10 = this.f17080a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                MockDownloadItems$lambda$4 = DownloadsScreenKt.MockDownloadItems$lambda$4(this.f17081b, this.f17082c, this.f17083d, mVar, intValue);
                return MockDownloadItems$lambda$4;
            case 1:
                TypingIndicator$lambda$1 = TypingIndicatorKt.TypingIndicator$lambda$1(this.f17081b, this.f17082c, this.f17083d, mVar, intValue);
                return TypingIndicator$lambda$1;
            case 2:
                LoadingState$lambda$1 = SoundscapesScreenKt.LoadingState$lambda$1(this.f17081b, this.f17082c, this.f17083d, mVar, intValue);
                return LoadingState$lambda$1;
            case 3:
                FeedbackCallout$lambda$1 = SoundscapesScreenKt.FeedbackCallout$lambda$1(this.f17081b, this.f17082c, this.f17083d, mVar, intValue);
                return FeedbackCallout$lambda$1;
            case 4:
                return ContainerShadowKt.a(this.f17081b, this.f17082c, this.f17083d, mVar, intValue);
            default:
                UltraBadge$lambda$1 = UltraBadgeKt.UltraBadge$lambda$1(this.f17081b, this.f17082c, this.f17083d, mVar, intValue);
                return UltraBadge$lambda$1;
        }
    }
}
