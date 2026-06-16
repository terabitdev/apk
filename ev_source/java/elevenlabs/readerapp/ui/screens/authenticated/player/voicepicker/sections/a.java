package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import ho.p;
import io.elevenlabs.ui.components.BottomSheetListKt;
import io.elevenlabs.ui.echo.components.UpsellTitleKt;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16499c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f16500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16501e;

    public /* synthetic */ a(String str, String str2, ho.a aVar, int i10, int i11) {
        this.f16497a = i11;
        this.f16498b = str;
        this.f16499c = str2;
        this.f16500d = aVar;
        this.f16501e = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z VoiceDesignRow$lambda$2;
        z UpsellBanner$lambda$2;
        switch (this.f16497a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                VoiceDesignRow$lambda$2 = VoicePickerDesignVoiceSectionKt.VoiceDesignRow$lambda$2(this.f16498b, this.f16499c, this.f16500d, this.f16501e, (m) obj, intValue);
                return VoiceDesignRow$lambda$2;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                return BottomSheetListKt.a(this.f16498b, this.f16499c, this.f16500d, this.f16501e, (m) obj, intValue2);
            default:
                int intValue3 = ((Integer) obj2).intValue();
                UpsellBanner$lambda$2 = UpsellTitleKt.UpsellBanner$lambda$2(this.f16498b, this.f16499c, this.f16500d, this.f16501e, (m) obj, intValue3);
                return UpsellBanner$lambda$2;
        }
    }
}
