package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.ExploreSeriesScreenKt;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14810b;

    public /* synthetic */ w(List list, int i10) {
        this.f14809a = i10;
        this.f14810b = list;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z MediaHeaderSection$lambda$0$1;
        sn.z Preview_VoicePicker$lambda$2;
        sn.z SeriesContent_lQd7feU$lambda$4$0$0$0$0$0$0;
        switch (this.f14809a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                MediaHeaderSection$lambda$0$1 = MediaHeaderSectionKt.MediaHeaderSection$lambda$0$1(this.f14810b, (r1.v0) obj, (u2.m) obj2, intValue);
                return MediaHeaderSection$lambda$0$1;
            case 1:
                int intValue2 = ((Integer) obj3).intValue();
                Preview_VoicePicker$lambda$2 = VoicePickerScreenKt.Preview_VoicePicker$lambda$2(this.f14810b, (h5.f) obj, (u2.m) obj2, intValue2);
                return Preview_VoicePicker$lambda$2;
            default:
                int intValue3 = ((Integer) obj3).intValue();
                SeriesContent_lQd7feU$lambda$4$0$0$0$0$0$0 = ExploreSeriesScreenKt.SeriesContent_lQd7feU$lambda$4$0$0$0$0$0$0(this.f14810b, (r1.y) obj, (u2.m) obj2, intValue3);
                return SeriesContent_lQd7feU$lambda$4$0$0$0$0$0$0;
        }
    }
}
