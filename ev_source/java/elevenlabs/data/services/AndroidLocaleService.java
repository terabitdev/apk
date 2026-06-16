package io.elevenlabs.data.services;

import io.elevenlabs.domain.services.LocaleService;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/elevenlabs/data/services/AndroidLocaleService;", "Lio/elevenlabs/domain/services/LocaleService;", "<init>", "()V", "value", "", "kotlin.jvm.PlatformType", "locale", "getLanguage", "getLocale", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AndroidLocaleService implements LocaleService {
    private final String value = Locale.getDefault().getLanguage();
    private final String locale = Locale.getDefault().toLanguageTag();

    @Override // io.elevenlabs.domain.services.LocaleService
    public String getLanguage() {
        String str = this.value;
        str.getClass();
        return str;
    }

    @Override // io.elevenlabs.domain.services.LocaleService
    public String getLocale() {
        String str = this.locale;
        str.getClass();
        return str;
    }
}
