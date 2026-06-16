package io.elevenlabs.readerapp.services;

import android.content.Context;
import io.elevenlabs.domain.StringProvider;
import java.util.Arrays;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0016¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J1\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0016¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/services/AndroidStringProvider;", "Lio/elevenlabs/domain/StringProvider;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getString", "", "res", "", "args", "", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getQuantityString", "id", "count", "formatArgs", "(II[Ljava/lang/Object;)Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AndroidStringProvider implements StringProvider {
    public static final int $stable = 8;
    private final Context context;

    public AndroidStringProvider(Context context) {
        context.getClass();
        this.context = context;
    }

    @Override // io.elevenlabs.domain.StringProvider
    public String getQuantityString(int id2, int count, Object... formatArgs) {
        formatArgs.getClass();
        String quantityString = this.context.getResources().getQuantityString(id2, count, Arrays.copyOf(formatArgs, formatArgs.length));
        quantityString.getClass();
        return quantityString;
    }

    @Override // io.elevenlabs.domain.StringProvider
    public String getString(int res, Object... args) {
        args.getClass();
        String string = this.context.getString(res, Arrays.copyOf(args, args.length));
        string.getClass();
        return string;
    }

    @Override // io.elevenlabs.domain.StringProvider
    public /* bridge */ String invoke(int i10) {
        return super.invoke(i10);
    }

    @Override // io.elevenlabs.domain.StringProvider
    public /* bridge */ String invoke(int i10, Object... objArr) {
        return super.invoke(i10, objArr);
    }

    @Override // io.elevenlabs.domain.StringProvider
    public String getString(int res) {
        String string = this.context.getString(res);
        string.getClass();
        return string;
    }

    @Override // io.elevenlabs.domain.StringProvider
    public String getQuantityString(int id2, int count) {
        String quantityString = this.context.getResources().getQuantityString(id2, count);
        quantityString.getClass();
        return quantityString;
    }
}
